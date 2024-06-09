package Java.Comparators;

import java.util.*;

public class sortSolution {
    
    private String name;
    private int id;
    private double cgpa;
    
    public sortSolution(String name, int id, double cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
    
    public int getID(){
        return id;
    }
    
    public double getCGPA(){
        return cgpa;
    }
    
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        List<sortSolution> students = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int id = scan.nextInt();
            String name = scan.next();
            double cgpa = scan.nextDouble();
            sortSolution person = new sortSolution(name, id, cgpa); // Correct order of parameters
            students.add(person);
        }
        
        // Sort the students using the StudentComparator
        Collections.sort(students, new StudentComparator());
        
        // Print the sorted list
        for (sortSolution student : students) {
            System.out.println(student.getName());
        }
        scan.close();
    }
}

class StudentComparator implements Comparator<sortSolution> {
    
    public int compare(sortSolution s1, sortSolution s2) {

        if (Double.compare(s2.getCGPA(), s1.getCGPA()) != 0) {
            return Double.compare(s2.getCGPA(), s1.getCGPA());
        }
        
        if (!s1.getName().equals(s2.getName())) {
            return s1.getName().compareTo(s2.getName());
        }
        
        return Integer.compare(s1.getID(), s2.getID());
    }
}
