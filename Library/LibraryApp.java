public class LibraryApp{

public static void main(String args[]){

Address libraryAddress = new Address("65-B","Lahore");
Address authorAddress= new Address("89-A","Karachi");
Date publicationDate=new Date(30,3,2025);
Person incharge=new Person("john", "Incharge",libraryAddress);
Person staff=new Person("mike", "Staff",libraryAddress);
Person author=new Person("Anne","Author",authorAddress);
Book B=new Book("programming fundamentals",publicationDate,"1234",author);
Library l1=new Library("library of Pakistan",B,incharge,staff);
l1.showLibraryDetails();


}}