# EXTRA CREDIT:
#
# Create a program that will play the Greed Game.
# Rules for the game are in GREED_RULES.TXT.
#
# You already have a DiceSet class and score function you can use.
# Write a player class and a Game class to complete the project.  This
# is a free form assignment, so approach it however you desire.

class GreedPlayer
  class DiceSet
    attr_reader :values

    def initialize
      @values = Array.new
    end

    def roll(qtd)
      @values = Array.new

      qtd.times do
        @values << Random.new.rand(1..6)
      end
    end
  end

  attr_reader :dices, :name
  attr_accessor :score

  def initialize(name)
    @dices = DiceSet.new
    @name = name
    @score = 0
  end
end

class GreedGame
  attr_reader :players
  attr_accessor :final_round

  def initialize(players_names)
    raise ArgumentError, "Players insuficientes" if players_names.size < 2

    @players = Array.new
    players_names.each do |player_name|
      @players << GreedPlayer.new(player_name)
    end
  end

  def turn(player)
    player.dices.roll((player.dices.values.size == 0) ? 5 : player.dices.values.size)

    score(player.dices.values)
  end

  def remove_scoring_dices(dices)
    previous_size = dices.size

    dices.delete(1)
    dices.delete(5)

    dices.each do |dice|
      if dices.count(dice) >= 3
        3.times do
          dices.delete_at(dices.find_index(dice))
        end
      end
    end

    previous_size - dices.size
  end

  def score(dices)
    points = 0
    numbers = Hash.new(0)

    dices.each do |num|
      numbers[num] += 1
    end

    numbers.each do |key, value|
      if value >= 3
        points += (key == 1) ? 1000 : key * 100
        value -= 3
      end

      points += 100 * value if key == 1
      points += 50 * value if key == 5
    end

    points
  end

  def end?
    true if final_round == :finished
  end
end

players = Array.new
i = 0
loop do
  print "\n#{i + 1}º player's name: "
  players << gets.chomp

  i += 1

  next if i == 1

  print "\nStart the game (s/n): "
  break if gets.chomp =~ /s|S/
end

greed_game = GreedGame.new(players)

sleep(1)
puts "\nStarting the game..."
until greed_game.end?
  greed_game.final_round = :started if greed_game.final_round == :about_to_start

  greed_game.players.each do |player|
    next if player.score >= 3000 && greed_game.final_round == :started

    sleep(1)
    puts "\n#{player.name}'s turn (score: #{player.score}):\n"

    accumulated_score = 0

    loop do
      puts "\n\tRolling the dices..."
      sleep(2)

      current_score = greed_game.turn(player)
      accumulated_score += current_score

      puts "\n\t#{player.dices.values} - score: #{current_score}"
      puts "\n\tturn's accumulated score: #{accumulated_score}"

      sleep(1)

      if current_score == 0
        puts "\n\tYou've lost all of your accumulated score at this turn"
        puts "\t#{player.name}'s turn is over!"
        print "\n\tPress ENTER to continue: "
        gets.chomp
        accumulated_score = 0
        break
      end

      removed_dices = greed_game.remove_scoring_dices(player.dices.values)

      if player.dices.values.empty?
        puts "\n\tAll of your thrown dices scored, you may roll 5 dices now"
      else
        puts "\n\t#{player.dices.values} - scoring dices removed (#{removed_dices})"
      end

      if (player.score == 0 && accumulated_score < 300)
        puts "\n\tTo start accumulating points for the first time,"
        puts "\tyou must get at least 300 in a sinlge turn"
        puts "\tIf you end your turn now you'll lose your score"

        print "\n\tDo you wish to continue your turn? (s/n): "

        if gets.chomp =~ /n|N/
          accumulated_score = 0
          break
        end
      else
        print "\n\tDo you wish to continue your turn? (s/n): "
        break if gets.chomp =~ /n|N/
      end
    end

    sleep(1)
    puts "\n\t#{player.name}'s score = #{player.score} + #{accumulated_score} => #{player.score + accumulated_score}"

    player.score += accumulated_score
    player.dices.values.clear

    if player.score >= 3000 && !greed_game.final_round
      greed_game.final_round = :about_to_start
      puts "\nFinal round started - #{player.name}'s score: #{player.score}"
      sleep(2)
      break
    end
  end

  greed_game.final_round = :finished if greed_game.final_round == :started
end

greed_game.players.sort! { |x, y| x.score <=> y.score }

sleep(1)
puts "\nRanking:"

greed_game.players.each_with_index do |player, index|
  sleep(1)
  puts "\t#{greed_game.players.size - index}° - #{player.name} (#{player.score})"
end
