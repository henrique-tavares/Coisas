from os import walk, mkdir, path
from shutil import move

class Linguagem:

	__slots__ = ("nome", "extensao")

	def __init__(self, nome, *extensao):
		self.nome = nome
		self.extensao = extensao

	def organize(self, sourcePath = './'):

		folder = path.join(sourcePath, self.nome)

		try:
			mkdir(folder)

		except Exception:
			print(f'\nPasta {self.nome} já existe!\n')
			exit()

		else:
			print(f'\nPasta {self.nome} criada!\n')

		for root, dirs, files in walk(sourcePath):

			if root == folder:
				continue

			for file in files:
				for ext in self.extensao:
					if file.endswith(ext):
						print(f'Movendo {path.join(root, file)} para {path.join(folder, file)} ...', end=' ')
						move(path.join(root, file), path.join(folder, file))
						print('pronto')
		
		print()
