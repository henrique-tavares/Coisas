#include <iostream>

using namespace std;

class A
{
private:
	int a;

public:
	A()
	{
		this->a = 10;
	}

	friend class B; // Friend class
};

class B;

class C
{
private:
	int c;

public:
	C()
	{
		this->c = 30;
	}

	void showB(B& classB);

	friend void showC(C&); // Friend global method
};

class B
{
private:
	int b;

public:
	B()
	{
		this->b = 20;
	}

	void showA(A& classA)
	{
		cout << "A::a = " << classA.a << endl;
	}

	friend void C::showB(B&); // Friend class method
};

void C::showB(B& classB)
{
	cout << "B::b = " << classB.b << endl;
}

void showC(C& classC)
{
	cout << "C::c = " << classC.c << endl;
}

int main()
{
	A a;
	B b;
	C c;

	b.showA(a);
	c.showB(b);
	showC(c);

	return 0;
}