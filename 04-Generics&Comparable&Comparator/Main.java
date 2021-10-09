import java.util.Comparator;

class Main {
  public static void main(String[] args) {
    MyArrayList<Student> list = new MyArrayList<Student>();

    Student s1 = new Student();
    s1.id = 1;
    s1.name = "ali";
    list.add(s1);

    Student s2 = new Student();
    s2.id = 2;
    s2.name = "Zakaria";
    list.add(s2);

    Student s3 = new Student();
    s3.id = 3;
    s3.name = "Ibrahim";
    list.add(s3);

    Comparator<Student> comparator = new Comparator<Student>(){
      public int compare(Student s1, Student s2)  {
        if(s1.id > s2.id){
          return -1;
        }else if(s1.id == s2.id){
          return 0;
        }else{
          return 1;
        }
      }
    };

    list.sort(comparator);

    System.out.println(list);
  }
}