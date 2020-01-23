package pack;

public class student {
public int id;
public String name;
public student(int id, String name) {
this.id=id;
this.name=name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public student(int id) {

	this.id = id;
}
public student() {
	
	
}
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + "]";
}

}
