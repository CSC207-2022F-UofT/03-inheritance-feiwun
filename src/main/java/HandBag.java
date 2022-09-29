/**
 * This file defines an child class named HandBag.
 * We have provided most of the code for this class, however,
 * you should implement the provided TODOs.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */
public class HandBag extends Bag{

    /**
     * Creates a new HandBag with the given color and
     * capacity.
     *
     * @param color
     * @param capacity
     */

    private String colour;
    private int capacity;

    public HandBag(String colourH, int capacityH) {
        /**
         * This is how we call the parent's constructor
         * The Python equivalent is super().__init__(...)
         */
        super(colourH, capacityH);
        this.colour = colourH;
        this.capacity = capacityH;
    }

    /**
     * Increase the capacity of this bag by 1.
     */
    @Override
    public void enhance() {
        /* TODO: Implement this method.
         *       You may want to use the increaseCapacity() method that was
         *       implemented in Bag.
         *
         * To call a method defined in a parent, you use super.method_name(...)
         */
        super.increaseCapacity(1);

    }

    public String getColor() {
        return this.colour;
    }

    public void setColor(String colourSet) {
        this.colour = colourSet;
    }
}
