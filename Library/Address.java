public class Address{
private String streetno;
private String city;

Address(String streetno,String city){

setStreet(streetno);
setcity(city);
}
Address(Address other){
this.streetno=other.streetno;
this.city=other.city;}
public void showAddress(){
System.out.println("Address");
System.out.printf( "Street Number: %s  City name : %s \n",streetno,city);}
public boolean equals(Address other){
if(this.streetno.equals(other.streetno) && this.city.equals(other.city)){return true;}
else{return false;}}
public void setStreet(String streetno){
this.streetno=streetno;
}
public void setcity(String city){
this.city=city;}

public String getStreet(){
return streetno;
}
public String getCity(){
return city;}
}
