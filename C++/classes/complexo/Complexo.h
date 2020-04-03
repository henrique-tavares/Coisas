#ifndef __COMPLEXO_H__
#define __COMPLEXO_H__

#include <iostream>

using namespace std;

class Complexo
{
private:
	double real;
	double imag;

public:
	Complexo() {}

	Complexo(double real, double imag)
	{
		this->real = real;
		this->imag = imag;
	}

	Complexo(const Complexo &c)
	{
		this->real = c.real;
		this->imag = c.imag;
	}

	double getReal()
	{
		return this->real;
	}

	void setReal(double real)
	{
		this->real = real;
	}

	double getImag()
	{
		return this->imag;
	}

	void setImag(double imag)
	{
		this->imag = imag;
	}

	Complexo conjugado()
	{
		return Complexo(this->real, -this->imag);
	}

	Complexo operator+(const Complexo &other)
	{
		return Complexo(this->real + other.real, this->imag + other.imag);
	}

	void operator+=(const Complexo &other)
	{
		this->real += other.real;
		this->imag += other.imag;
	}

	Complexo operator-(const Complexo &other)
	{
		return Complexo(this->real - other.real, this->imag - other.imag);
	}

	void operator-=(const Complexo &other)
	{
		this->real -= other.real;
		this->imag -= other.imag;
	}

	Complexo operator*(const Complexo &other)
	{
		return Complexo(
			(this->real * other.real) - (this->imag * other.imag),
			(this->real * other.imag) + (this->imag * other.real)
		);
	}

	void operator*=(const Complexo &other)
	{
		this->real = (this->real * other.real) - (this->imag * other.imag);
		this->imag = (this->real * other.imag) + (this->imag * other.real);
	}

	Complexo operator/(Complexo &other)
	{
		return Complexo(
			(*this * other.conjugado()).real / (other * other.conjugado()).real,
			(*this * other.conjugado()).imag / (other * other.conjugado()).real
		);
	}

	void operator/=(Complexo &other)
	{
		*this *= other.conjugado();

		this->real /= (other * other.conjugado()).real;
		this->imag /= (other * other.conjugado()).real;
	}

	friend ostream& operator<<(ostream &out, const Complexo &c)
	{
		out << c.real;

		if (c.imag > 0)
			out << " +" << c.imag << "i";

		else if (c.imag < 0)
			out << " " << c.imag << "i";

		return out;
	}

	friend istream& operator>>(istream &in, Complexo &c)
	{
		cout << "Real: ";
		in >> c.real;

		cout << "Imag: ";
		in >> c.imag;

		return in;
	}
};

#endif