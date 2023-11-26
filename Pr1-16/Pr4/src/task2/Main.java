package task2;

public class Main {
    public static void main(String[] args) {
        Head head = new Head();
        Leg leftLeg = new Leg();
        Leg rightLeg = new Leg();
        Hand leftHand = new Hand();
        Hand rightHand = new Hand();

        Human person = new Human(head, leftLeg, rightLeg, leftHand, rightHand);
        person.introduce();
        person.performActivities();
    }
}
