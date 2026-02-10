public class CircleApp {
    public static void main(String[] args) {
        // Create circles using different constructors
        Circle c1 = new Circle(); // Default
        Circle c2 = new Circle(5.0, 10.0, 10.0);

        System.out.println("Circle 1 Radius: " + c1.getRadius());
        System.out.println("Circle 2 Area: " + c2.getArea());

        // Move Circle 2
        c2.move(-5, 2);
        System.out.println("Circle 2 new center: " + c2.getOriginX() + ", " + c2.getOriginY());

        // Scale Circle 1
        c1.scale(3.0);
        System.out.println("Circle 1 new radius: " + c1.getRadius());
        
        // Testing encapsulation: This would cause an error if uncommented
        // c1.radius = 10; 
        c1.setRadius(10); // This is the correct way

        c1 = new Circle(5.0, 0.0, 0.0);
        c2 = new Circle(5.0, 8.0, 0.0);  // These should overlap (dist 8 < radii sum 10)
        Circle c3 = new Circle(2.0, 20.0, 20.0); // Far away

        System.out.println("C1 overlaps C2: " + c1.isOverlappedWith(c2)); // true
        System.out.println("C1 overlaps C3: " + c1.isOverlappedWith(c3)); // false


        Circle small = new Circle(2.0, 0.0, 0.0);
Circle large = new Circle(10.0, 1.0, 1.0); // Big circle centered near origin

if (small.isEnclosedBy(large)) {
    System.out.println("The small circle is tucked safely inside the large one!");
} else {
    System.out.println("The small circle is sticking out or completely outside.");
}
    }
}