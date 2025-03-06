public class Library{
String name;
Book book;
Person incharge;
Person staff;

Library(String name,Book book,Person incharge,Person staff){
setName(name);
this.book=book;
this.incharge=incharge;
this.staff=staff;}


Library(Library other){
this.name=other.name;
this.book=other.book;
this.incharge=other.incharge;
this.staff=other.staff;}
public boolean equals(Library other)
{
if (this.name.equals(other.name)&&this.book.equals(other.book)&&this.incharge.equals(other.incharge)&&this.staff.equals(other.staff)){
return true;}
else{
return false;}}

public void showLibraryDetails(){
System.out.println("Name of Library: " + name);
book.showBookDetails();
System.out.println("Details of incharge");
incharge.showPersonDetails();
System.out.println("Details of Staff");
staff.showPersonDetails();
}

public void setName(String name){
this.name=name;}
public String getName(){
return name;}
}

