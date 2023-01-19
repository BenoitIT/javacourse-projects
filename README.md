# javacourse-projects
this repository contains Library manaement system as the final projects as well class daily tasks
## ADVANCED JAVA PROGRAMMING PROJECTS





### NAME: NDAGIJIMANA Benoit
### REG NO: 221011094
### CLASS NO: 70

#### PROJECT NAME: LIBRAY MANAGEMENT SYSTEM





#### 1.PLANNING 
The goal of library management system is to manage all the book transaction in a fast and efficient way. Using this system, the transactions of the books in the library will be more trustworthy and this system will not rely to internet connection. The system will eliminate redundancy. The system will keep track the book borrowed, the date borrowed, and will give date to returned the book. The objective is to make the work of librarian and the transaction of book borrowed and returned become easier. This will provide efficient library management
##### Project goals and objectives
* 	To organizes the process of borrowing and returning the books.
* 	To state the specific location of the books.
* 	To state the status of available books.
*     to collect, store, organize, retrieve and make available the information sources to the library information users.
#####  Problems to be solved
*	Lack of security
*	Too much paper wastage As Papers take up a massive amount of room in the library.
*	Poor Data Storage
*	Unavailability of Information.
*	Slow Retrieval of Data
*	Time consuming

### 2. Design

*	Allow the librarian to search for books based on title and find related information about particular book.
*	System allows the librarian delete and update a book.
*	System allows librarian to add the books.
*	The system shows the librarian the issued books and returned books.
*	Only authorized user can use the system functionalities.
      Interaction of the librarian with library management system
 





### 3. Development

*	We developed the system backend and frontend parts using java programming language as well as NetBeans IDE.
*	For frontend parts, we used swing controls generated from NetBeans to create forms, buttons, labels as well as user interface as whole.
*	We used MySQL as database management system to hold backend data.
*	We create interactions between user interface components such as forms and buttons using java programming language syntaxes.
*	We used com.mysql.jdbc_5.1.5.jar as library handling MYSQL connection with the system.

### 4.Testing 
* Open a project in Apache NetBeans.
* Open xampp server to start MYSQL.
* Run login page.
* Enter credentials of librarian (username and password).
* If username and password correct. The user gets welcome message to the system.
* unless username and password are correct, the user is denied to enter in system.
* Once the user gets logged in the system click:
* Register book: to open register book panel.
* In register book form fill the book details such its name, type, author as well it’s corresponding level
* And click addNew button to save the book in database.
* Click home button to back to the landing page.
* Record book return: to open record the returned book panel.
* In record returned book form fill the details of book returning such as name of person returning the book, the date in which book was lent, date in which book is * returned and book identity number.
And hint record return button.
*Click home button to back to the landing page.
* In returned book panel. You can click check returned books button to search for the activities regarding book returns by given date.
* Click home button to back to the landing page.
* Lend book button: to open lend book panel.

* In record lending form fill the details of book to be lent as well as all details concerning book lending activity such as name of person lending the book, the date in which book is lent, date in which book will be returned and book identity number.
And hint record button to save the activity.
* Click home button to back to the landing page.
In lend book panel. You can click search book button to check if the book asked by student exists.

* Search book: to open search book panel.
Once the search panel opened the librarian is able to search book by its name.
* Once book found he /she is able to delete that book,
As well as update information related to that book.
* If he want to view the list of registered book in general, he/she can click get all book button. And load the list of the books.

###5.Deployment 

*	Installing MYSQL as database management system.
*	Download and configure com.mysql.jdbc_5.1.5.jar as library handling MYSQL connection.
*	Use portable storage device to transfer project from development computer to the any library’s librarian computer.
*	Run project file and start using the system.



