public class Student implements Comparable<Student>{
  public int id;
  public String name;


  public int getId(){
    return this.id;
  }

  public int compareTo(Student std){
    return this.id - std.getId();
  }

  public String toString(){
    return "id : "+id + " , name : "+name;
  }
}