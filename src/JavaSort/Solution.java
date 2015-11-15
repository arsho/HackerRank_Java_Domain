package JavaSort;

import java.util.*;

class Student implements Comparable<Student>{

    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
        if(o.cgpa-cgpa>0) return 1;
        else if(o.cgpa-cgpa<0) return -1;
        else{
            if(o.fname.equals(fname)){
                return o.id-id;
            }
            else{
                return fname.compareTo(o.fname);
            }
        }
    }
    
    
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        
        Collections.sort(studentList);
        
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
/*
5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
*/