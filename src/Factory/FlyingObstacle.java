package Factory;

public class FlyingObstacle extends Obstacle {
    private final FlyingObstacleType flyObstacleType;

    public FlyingObstacle(FlyingObstacleType flyObstacleType){
        this.flyObstacleType = flyObstacleType;
    }
    public String toString() {
        return "Flying Obstacle: " + flyObstacleType;
    }
}
