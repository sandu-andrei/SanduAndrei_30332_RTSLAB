import java.util.Observable;

// Model
public class Fir extends Observable implements Runnable {
    int id;
    int processorLoad;
    int priority;

    Fir(int id, int priority, int procLoad) {
        this.id = id;
        this.processorLoad = procLoad;
        this.priority = priority;
    }

    public void run() {
        int c = 0;
        while (c < 1000) {
            for (int j = 0; j < this.processorLoad; j++) {
                j++;
                j--;
            }
            c++;
            setChanged();
            notifyObservers(c);
        }
    }
}
