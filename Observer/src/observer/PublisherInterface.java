package observer;

import java.util.ArrayList;

public interface PublisherInterface {

    ArrayList<PublisherActionListener> getListeners();

    void addListener(PublisherActionListener listner);

    void removeListener(PublisherActionListener listener);

    void removeAllListeners();

    void notifySubscribers(String message);
}
