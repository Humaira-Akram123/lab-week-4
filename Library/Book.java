public class Book{
private String title;
private Person author;
private Date publicationDate;
private String issn;

public Book(String title,Date publicationDate, String issn, Person author){
setTitle(title);
this.publicationDate=publicationDate;
setIssn(issn);
this.author=author;
}
Book(Book other){
this.title=other.title;
this.author=other.author;
this.publicationDate=other.publicationDate;
this.issn=other.issn;}
public boolean equals(Book other){
if (this.title.equals(other.title)&&this.author.equals(other.author)&&this.publicationDate.equals(other.publicationDate)&&this.issn.equals(other.issn)){
return true;}
else
{return false;}}
public void showBookDetails()
{
System.out.println("Title : "+title );
System.out.print("Date of Publcation : ");
publicationDate.showDate();
System.out.println();
System.out.println("Issn : "+issn);
System.out.println("Author Details");
author.showPersonDetails();
}

public void setTitle(String title){
this.title=title;
}

public void setIssn(String issn){
this.issn=issn;}

public String getTitle(){
return title;}

public String getIssn(){
return issn;}

}