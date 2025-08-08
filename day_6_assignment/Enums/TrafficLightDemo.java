package day_6_assignment.Enums;

public class TrafficLightDemo {

	interface State {
		State next();
	}

	enum TrafficLight implements State {
		RED {

			public State next() {
				return GREEN;
			}
		},
		GREEN {

			public State next() {
				return YELLOW;
			}
		},
		YELLOW {

			public State next() {
				return RED;
			}
		};
	}

	public static void main(String[] args) {
		State current = TrafficLight.RED;
		System.out.println("Starting from: " + current);

		for (int i = 1; i <= 6; i++) {
			current = current.next();
			System.out.println("Transition " + i + ": " + current);
		}
	}
}
