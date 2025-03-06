public class Person {
    private String name;
    private String role;
    private Address address;

    
    public Person(String name, String role, Address address) {
        setName(name);  
        setRole(role);  
        this.address = address;
    }
Person(Person other){
this.name=other.name;
this.role=other.role;
this.address=other.address;}
public boolean equals(Person other){
if(this.name.equals(other.name)&&this.role.equals(other.role)&&this.address.equals(other.address)){return true;
}
else{
return false;}}

    
    public void showPersonDetails() {
        System.out.println("Name: " + name + " Role: " + role);
        address.showAddress(); 
    }

    
    public void setName(String name) {
        this.name = name;
    }

   
    public void setRole(String role) {
        this.role = role;
    }

   
    public String getName() {
        return name;
    }

   
    public String getRole() {
        return role;
    }
}


