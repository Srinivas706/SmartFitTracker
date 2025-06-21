package com.smartfit.SmartFitTracker;

import java.util.Date;
import java.util.Scanner;
import java.util.InputMismatchException;


import com.smartfit.SmartFitTracker.model.*;
import com.smartfit.SmartFitTracker.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SmartFitCLI implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WorkoutRepository workoutRepository;

    @Autowired
    private MealRepository mealRepository;

    @Autowired
    private GoalRepository goalRepository;

    @Autowired
    private ProgressRepository progressRepository;

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to SmartFit CLI!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add User");
            System.out.println("2. Add Workout");
            System.out.println("3. Add Meal");
            System.out.println("4. Add Goal");
            System.out.println("5. Add Progress");
            System.out.println("6. View Users");
            System.out.println("7. View Workouts");
            System.out.println("8. View Meals");
            System.out.println("9. View Goals");
            System.out.println("10. View Progress");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            int choice = -1;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // clear the invalid input
                return;
            }


            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    userRepository.save(new User(null, name, email));
                    System.out.println("User added.");
                    break;

                case 2:
                    System.out.print("Enter userId: ");
                    String uid = scanner.nextLine();
                    System.out.print("Workout type: ");
                    String type = scanner.nextLine();
                    System.out.print("Duration (mins): ");
                    int duration = Integer.parseInt(scanner.nextLine());
                    System.out.print("Calories burned: ");
                    int cal = Integer.parseInt(scanner.nextLine());
                    workoutRepository.save(new Workout(null, uid, type, duration, cal, new Date()));
                    System.out.println("Workout added.");
                    break;

                case 3:
                    System.out.print("Enter userId: ");
                    String mealUid = scanner.nextLine();
                    System.out.print("Meal name: ");
                    String mealName = scanner.nextLine();
                    System.out.print("Calories: ");
                    int mealCal = Integer.parseInt(scanner.nextLine());
                    mealRepository.save(new Meal(null, mealUid, mealName, mealCal, new Date()));
                    System.out.println("Meal added.");
                    break;

                case 4:
                    System.out.print("Enter userId: ");
                    String goalUid = scanner.nextLine();
                    System.out.print("Goal type: ");
                    String goalType = scanner.nextLine();
                    System.out.print("Target: ");
                    String target = scanner.nextLine();
                    goalRepository.save(new Goal(null, goalUid, goalType, target));
                    System.out.println("Goal added.");
                    break;

                case 5:
                    System.out.print("Enter userId: ");
                    String progUid = scanner.nextLine();

                    System.out.print("Enter weight: ");
                    double weight = Double.parseDouble(scanner.nextLine());

                    System.out.print("Enter BMI: ");
                    double bmi = Double.parseDouble(scanner.nextLine());

                    progressRepository.save(new Progress(null, progUid, weight, bmi, new Date()));
                    System.out.println("Progress added.");
                    break;

                case 6:
                    System.out.println("Users:");
                    userRepository.findAll().forEach(System.out::println);
                    break;

                case 7:
                    System.out.println("Workouts:");
                    workoutRepository.findAll().forEach(System.out::println);
                    break;

                case 8:
                    System.out.println("Meals:");
                    mealRepository.findAll().forEach(System.out::println);
                    break;

                case 9:
                    System.out.println("Goals:");
                    goalRepository.findAll().forEach(System.out::println);
                    break;

                case 10:
                    System.out.println("Progress:");
                    progressRepository.findAll().forEach(System.out::println);
                    break;

                case 11:
                    System.out.println("Exiting CLI...");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
