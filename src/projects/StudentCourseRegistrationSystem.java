package projects;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class StudentCourseRegistrationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option;

        int studentID;

        String studentName;

        int courseID;

        String courseName;

        int maximum_capacity;


        LinkedHashMap<Integer,String> studentDetails = new LinkedHashMap<>();


       LinkedHashMap<Integer,String>  courseDetails = new LinkedHashMap<>();

        Map<Integer, LinkedHashSet<Integer>> enrollDetails = new LinkedHashMap<>();


        LinkedHashMap<Integer,Integer> courseCapacity = new LinkedHashMap<>();



        do{
            System.out.println("Student Course Registration");

            System.out.println("________________________________");

            System.out.println("Enter the number to select the option");

            System.out.println("1.Add Student");

            System.out.println("2. Add Course");

            System.out.println("3. Enroll Student in Course");

            System.out.println("4. Drop Student from Course");

            System.out.println("5. View Student details");

            System.out.println("6. Exit");

            option = sc.nextInt();

            switch(option){

                case 1:

                    System.out.println("Enter student ID:");

                    studentID=sc.nextInt();

                    System.out.println("Enter student name:");

                    sc.nextLine();
                    studentName = sc.nextLine();
                    if(studentDetails.containsKey(studentID))
                    {
                        System.out.println("Student ID already exists");
                    }
                    else
                    {
                        studentDetails.put(studentID, studentName);
                    }


                    break;

                case 2:

                    System.out.println("Enter course ID:");

                    courseID = sc.nextInt();

                    System.out.println("Enter course name:");

                    sc.nextLine();
                    courseName = sc.nextLine();

                    System.out.println("Maximum capacity:");

                    maximum_capacity=sc.nextInt();
                    if(courseDetails.containsKey(courseID))
                    {
                        System.out.println("Course ID already exists");
                    }
                    else
                    {
                        courseDetails.put(courseID, courseName);
                        courseCapacity.put(courseID, maximum_capacity);
                        System.out.println("Course added successfully");
                    }


                    break;

                case 3:

                    System.out.println("Enter Student id");

                    studentID=sc.nextInt();

                    System.out.println("Enter Course id");

                    courseID=sc.nextInt();

                    maximum_capacity=0;

                    int enrolledCount = 0;

                    for(LinkedHashSet<Integer> courses : enrollDetails.values())
                    {
                        if(courses.contains(courseID))
                        {
                            enrolledCount++;
                        }
                    }
                    int capacity = courseCapacity.get(courseID);


                    if(!studentDetails.containsKey(studentID))
                    {
                        System.out.println("Student ID not found");
                        break;
                    }
                    if(!courseDetails.containsKey(courseID))
                    {
                        System.out.println("Course ID not found");
                        break;
                    }
                    if(enrolledCount >= capacity)
                    {
                        System.out.println("Maximum capacity reached");
                        break;
                    }
                    if(enrollDetails.containsKey(studentID)
                            && enrollDetails.get(studentID).contains(courseID))
                    {
                        System.out.println("Student already enrolled");
                        break;
                    }
                    enrollDetails.putIfAbsent(studentID,new LinkedHashSet<>());

                    enrollDetails.get(studentID).add(courseID);

                    System.out.println("Enrollment successful");

                    break;



                case 4:

                    System.out.println("Enter the student ID:");

                    studentID=sc.nextInt();

                    System.out.println("Enter course ID:");

                    courseID=sc.nextInt();
                    if(enrollDetails.containsKey(studentID)
                            && enrollDetails.get(studentID).contains(courseID))
                    {
                        enrollDetails.get(studentID).remove(courseID);

                        System.out.println("Student successfully dropped");
                    }
                    else
                    {
                        System.out.println("Enrollment not found");
                    }

                    break;

                case 5:

                    System.out.println("Enter the student ID to get the enrolled courses:");

                    studentID=sc.nextInt();

                    LinkedHashSet<Integer> courses =
                            enrollDetails.get(studentID);

                    if(courses == null || courses.isEmpty())
                    {
                        System.out.println("No courses enrolled");
                        break;
                    }

                    System.out.println(
                            "Student : " +
                                    studentDetails.get(studentID));

                    for(Integer cid : courses)
                    {

                        System.out.println(
                                "Course : " +
                                        courseDetails.get(cid));
                    }



                    break;




                case 6:

                    System.out.println("Thank for using our registration system");

                    break;

                default:

                    System.out.println("Invalid number!!! Please try again!!");
                    break;



            }
                }
        while(option!=6);

        sc.close();

            }

        }









