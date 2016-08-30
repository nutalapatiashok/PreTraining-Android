
class Person
{
String name,address;

Person(String name,String address)
{
this.name=name;
this.address=address;
}

String getAddress()
{
return address;
}

String getName()
{
return name;
}

void setAddress(String address)
{
this.address=address;
}

void setName(String name)
{
this.name=name;
}

public String toString()
{
return "Person[name="+name+",address="+address+"]";
}
}

class Student extends Person
{

String program;
int year;
double fee;

Student(String name,String address,String program,int year,double fee)
{
super(name,address);
this.program=program;
this.year=year;
this.fee=fee;
}

void setProgram(String program)
{
this.program=program;
}

String getProgram()
{
return program;
}

void setYear(int year)
{
this.year=year;
}

int getYear()
{
return year;
}

void setFee(double fee)
{
this.fee=fee;
}

double getFee()
{
return fee;
}

public String toString()
{
return "Student[Person[name="+name+",address="+address+"],program="+program+",year="+year+",fee="+fee+"]";
}
}

class Staff extends Person
{
String school;
double pay;

Staff(String name,String address,String school,double pay)
{
super(name,address);
this.school=school;
this.pay=pay;
}

void setSchool(String school)
{
this.school=school;
}

String getSchool()
{
return school;
}

void setPay(double pay)
{
this.pay=pay;
}

double getPay()
{
return pay;
}

public String toString()
{
return "Staff[Person[name="+name+",address="+address+"],school="+school+",pay="+pay+"]";
}
}

class PersonDemo
{
public static void main(String a[])
{
System.out.println("\n----Person Details----\n");
Person p=new Person("ASHOK","VIJAYAWADA");
System.out.println(p);

System.out.println("\n----Student Details----\n");
Student st=new Student("ASHOK","VIJAYAWADA","CSE",4,72500);
System.out.println(st);

System.out.println("\n----Staff Details----\n");
Staff sf=new Staff("ASHOK","VIJAYAWADA","DIET",50000);
System.out.println(sf);
}
}


