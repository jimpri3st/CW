CW4

MVVM vs MVC Comparison.


What is MVC?
Model, View, and Controller (MVC) is an architectural pattern that divides an application into three primary logical components. As a result, MVC was formed. Model View Controller is the complete form of MVC. A component is designed in this architecture to handle specific development aspects of an application. The business logic and presentation layers are separated in MVC. This architectural pattern is mostly utilized for graphical user interfaces on desktop computers (GUIs).
What is MVVM?
The MVVM design allows for the development of the graphical user interface to be separated from the rest of the application using mark-up language or GUI code. Model–View–ViewModel is the full form of MVVM. The MVVM view model is a value converter, which implies that it is the view model's role to expose data objects from the Model in such a way that they can be controlled and presented easily.








Key Differences

MVC
The controller is the application's entry point.
Controller and View have a one-to-many relationship. View Does not have reference to the Controller
MVC is Old Model
Difficult to read, change, to unit test, and reuse this Model
This Model MVC is difficult to read, alter, unit test, and reuse. Separately from the user, the model component can be tested.

MVVM

The view is the application's main entry point.
View and View Model have a one-to-many relationship.
The View-Model is referenced in the views.
The Model View ViewModel (MVVM) is a relatively new model.
When we have complex data bindings, debugging becomes more difficult.
Separate unit testing is simple, and the code is event-driven.

Advantage of MVC
•	Support for a new type of client is easier.
•	The development of different components can be done in concurrently.
•	By separating an application into independent (MVC) pieces, it eliminates complexity.
•	It solely employs the front controller pattern, which uses a single controller to execute web application requests.
•	Provides the best test-driven development support. It works well for Web apps, which are supported by large teams of web designers and developers.
•	It provides a clean separation of concerns(SoC).
•	All classes and objects are self-contained, allowing you to test them independently. MVC allows logical grouping of related actions on a controller together.
Advantages of MVVM
•	Easy to maintain and test
•	Business logic is separated from Ul; 
•	Components are simple to maintain and test;
•	Loosely connected architecture: MWM creates a loosely coupled architecture for your application.
•	You don't need to reference the View' when writing unit test cases for the viewmodel and Model layers.

Disadvantage of MVC
• Business logic and Ul are mixed together 
• Tests are harder to reuse and implement • There is no formal validation support 
• Data is more complex and inefficient 
• Using MVC with a modern user interface is tricky
• Multiple programmers are required to undertake parallel programming, and knowledge of multiple technologies is necessary.
Disadvantages of MVVM
Maintenance of lots of codes in controller
Some people believe that MVVM design is overkill for simple UIs because it requires a lot of code maintenance in the controller.
There isn't a strong connection between the view and the view model.

Guidelines and Rules


The project is created with Mvvm in mind. An improvement would be to gather the classes in folders for model view viewmodel and adapters for better managemenent but the idea is the same. 
We have the models for the objects, the viewmodel as an intermediary between the models and the view(activities) and then we have the views(activities).
View and viewmodel can be developed seperately from each other. ViewModels should not hold any Android framework classes reference. Views should not have any kind of logic, move it to ViewModel.
Instead of passing Views to ViewModels, let the Views observe changes to it. 




