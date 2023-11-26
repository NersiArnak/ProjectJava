package task2;

class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public void introduce() {
        System.out.println("Hello, I am a human.");
    }

    public void performActivities() {
        // Human can perform various activities using their body parts
        head.talk();
        leftLeg.walk();
        rightLeg.walk();
        leftHand.doActivity();
        rightHand.doActivity();
    }
}

class Head {
    public void talk() {
        System.out.println("Head: Talking...");
    }
}

class Leg {
    public void walk() {
        System.out.println("Leg: Walking...");
    }
}

class Hand {
    public void doActivity() {
        System.out.println("Hand: Performing an activity...");
    }
}


