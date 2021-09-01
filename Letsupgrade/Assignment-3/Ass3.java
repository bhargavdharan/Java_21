import java.util.*;

class Uber {
    int fare;
    int d; // distance travelled by the user.
    int cd; // distance of cab from user

    public Uber() {
        fare = 30;
    }

    // parameterized constructor
    public Uber(int amt) {
        fare = amt;

    }

    void showFare() {
        System.out.println("Total Fare: Rs " + fare);
    }
}

class Driver {
    public static void main(String[] args) {
        int cd;
        // Uber ub = new Uber();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a cab distance from user:");
        cd = sc.nextInt();

        if (cd > 5) {
            Uber ub = new Uber(30 + 10 * (cd - 5));
            System.out.print("Enter the distance travelled:");
            ub.d = sc.nextInt();

            ub.fare = ub.fare + 10 * ub.d;

            ub.showFare();

            
        } else {
            Uber ub = new Uber();
            System.out.print("Enter the distance travelled:");
            ub.d = sc.nextInt();

            ub.fare = ub.fare + 10 * ub.d;

            ub.showFare();

        
        }

    }

}

/**
 * -----output--------
 *          Enter a cab distance from user:6
            Enter the distance travelled:10
            Total Fare: Rs 140
 */
