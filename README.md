# Observer-Design-Pattern
THE OBSERVER DESIGN PATTERN

The Observer design pattern is a behavioural design pattern that defines a one-to-many dependency between objects, so that when one object changes state, all its dependents are notified and updated automatically. The Observer pattern is also known as the Publish-Subscribe pattern.

In the Observer pattern, there are two main components: the Subject and the Observer. The Subject is the object that is being observed or monitored for changes, while the Observer is the object that is interested in receiving notifications when the Subject's state changes. The Subject maintains a list of its Observers and notifies them automatically when its state changes.

The Observer pattern is useful in situations where there are multiple objects that need to be notified and updated when a particular object's state changes.

The Observer pattern provides a loose coupling between objects, since the Subject and Observer do not need to know anything about each other's implementation details. This makes the Observer pattern a flexible and reusable design pattern.


GENERIC STRUCTURE OF THE OBSERVER DESIGN PATTERN

<img width="482" alt="image" src="https://user-images.githubusercontent.com/119789101/233460012-7eccf44f-d5bb-4b72-ae08-57160e496e35.png">


THE SCENARIO

In this case study, we have a newsletter whose release has to be notified to all its subscribers. Each subscriber has their own topic of interest and wish to read news belonging to only that particular genre. Each release of the newsletter does not necessarily include all the genres.
Subscribers subscribe to the newsletter and are added to the mailing list maintained by the newsletter. If a given release has the subscriber’s topic of interest, they can read the article.

Consider a situation where subscriber1, subscriber2 and subscriber3 are interested in Sports, Lifestyle and Current Affairs respectively. 
Let us say that the first release of the newsletter has information regarding only Lifestyle and Current Affairs. Here, only subscriber2 and subscriber3 receive the required articles.
Suppose the second release of the newsletter has information regarding only Sports and Lifestyle, subscriber1 and subscriber2 receive the required articles.

This is solved using the observer design pattern where the newsletter is the subject whose release is being monitored. The observers are the subscribers who wait for a notification of release. The newsletter maintains an array list of all its subscribers and sends out a notification when there is a release. Each release consists of news articles classified by their genres. The subscribers read articles only under their area of interest.THE UML DIAGRAM

THE UML DIAGRAM

![image](https://user-images.githubusercontent.com/119789101/233460110-e21fd090-015d-48a5-b4f2-e7460cd7bc36.png)

THE SEQUENCE DIAGRAM

![image](https://user-images.githubusercontent.com/119789101/233459851-ae2993b4-9e9a-495d-83ef-952cc9d9c909.png)


The sequence diagram shows the runtime interactions: The Subscriber1, Subscriber2 and Subscriber3 objects call attach() on NewsLetter to register themselves. Assuming that the state of NewsLetter changes ie there is a release, NewsLetter calls notifyAllObservers() on itself. notifyAllObservers() calls update() on the registered Subscriber1, Subscriber2 and Subscriber3 objects, which request the changed data from NewsLetter to update their state.
