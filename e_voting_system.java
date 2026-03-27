import java.util.*;

class candidate {
    String name;
    int votes;

    candidate(String name) {
        this.name = name;
        this.votes = 0;
    }
}

class voter {
    String id;
    boolean hasvoted;

    voter(String id) {
        this.id = id;
        this.hasvoted = false;
    }
}

class votingsystem {
    ArrayList<candidate> candidates = new ArrayList<>();
    HashMap<String, voter> voters = new HashMap<>();

    void addcandidate(String name) {
        candidates.add(new candidate(name));
        System.out.println("Candidate added");
    }

    void addvoter(String id) {
        voters.put(id, new voter(id));
        System.out.println("Voter added");
    }

    void vote(String voterid, int choice) {
        if (!voters.containsKey(voterid)) {   // FIXED
            System.out.println("Invalid voter");
            return;
        }

        voter v = voters.get(voterid);

        if (v.hasvoted) {
            System.out.println("Already voted");
            return;
        }

        if (choice < 0 || choice >= candidates.size()) {
            System.out.println("Invalid candidate");
            return;
        }

        candidates.get(choice).votes++;
        v.hasvoted = true;

        System.out.println("Vote successfully");
    }

    void showcandidates() {
        System.out.println("\nCandidates:");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println(i + ". " + candidates.get(i).name);
        }
    }

    void showresults() {
        System.out.println("\nResults:");
        for (candidate c : candidates) {
            System.out.println(c.name + " : " + c.votes);
        }
    }
}

public class e_voting_system {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        votingsystem system = new votingsystem();

        int choice;

        do {
            System.out.println("\n--- Online Voting System ---");
            System.out.println("1. Add Candidate");
            System.out.println("2. Add Voter");
            System.out.println("3. Vote");
            System.out.println("4. Show Results");
            System.out.println("0. Exit");

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    scan.nextLine(); // FIXED
                    System.out.println("Enter candidate name:");
                    String name = scan.nextLine();
                    system.addcandidate(name);
                    break;

                case 2:
                    System.out.println("Enter voter id:");
                    String id = scan.next();
                    system.addvoter(id);
                    break;

                case 3:
                    System.out.print("Enter voter ID: ");
                    String vId = scan.next();

                    system.showcandidates();
                    System.out.print("Choose candidate number: ");
                    int c = scan.nextInt();

                    system.vote(vId, c);
                    break;

                case 4:
                    system.showresults();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        scan.close();
    }
}

