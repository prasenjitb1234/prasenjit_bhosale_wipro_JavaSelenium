package day_6_assignment.Enums;

//5: Priority Levels with Extra Data

//Implement enum PriorityLevel with constants (LOW, MEDIUM, HIGH, CRITICAL), each having:
//•	A numeric severity code.
//•	A boolean isUrgent() if severity ≥ some threshold.
//Print descriptions and check urgency.


public class PriorityLevelDemo {

    enum PriorityLevel {
        LOW(1),
        MEDIUM(2),
        HIGH(3),
        CRITICAL(4);

        private final int severity;

        // constructor
        PriorityLevel(int severity) {
            this.severity = severity;
        }

        public int getSeverity() {
            return severity;
        }

        
        public boolean isUrgent() {
            return severity >= 3;
        }

        @Override
        public String toString() {
            return name() + " (Severity: " + severity + ", Urgent: " + isUrgent() + ")";
        }
    }

    public static void main(String[] args) {
        for (PriorityLevel level : PriorityLevel.values()) {
            System.out.println(level);
            if (level.isUrgent()) {
                System.out.println("Take immediate action for: " + level.name());
            } else {
                System.out.println("Normal handling for: " + level.name());
            }
            System.out.println();
        }
    }
}
