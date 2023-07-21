package sg.edu.nus.iss.epat.tdd.workshop;

import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ToDoListTest extends TestCase {
   // Define Test Fixtures
	
	private ToDoList toDoList;
	
	private Task taskOne;
	private Task taskTwo;
	private Task taskThree;
	
	private final String stringOne = new String("one");
	private final String stringTwo = new String("two");
	private final String stringThree = new String("three");

   public ToDoListTest() {
      super();
   }

   @Before
   public void setUp() throws Exception {
	   // Initialise Test Fixtures
	   taskOne = new Task(stringOne);
	   taskTwo = new Task(stringTwo);
	   taskThree = new Task(stringThree);
	   toDoList = new ToDoList();
   }

   @After
   public void tearDown() throws Exception {
	   // Uninitialise test Fixtures
	   toDoList = null;
   }

   @Test
   public void testAddTask() {
	   toDoList.addTask(taskOne);
	   assertEquals(1, toDoList.getAllTasks().size());
	   assertEquals(taskOne, toDoList.getTask(stringOne));
      //fail("Not implemented yet");
   }

   @Test
   public void testGetStatus() {
	   toDoList.addTask(taskOne);
	   assertFalse(toDoList.getStatus(stringOne));
	   //fail("Not implemented yet");
   }

   @Test
   public void testRemoveTask() {
	   toDoList.addTask(taskOne);
	   toDoList.removeTask(stringOne);
	   assertFalse(toDoList.getAllTasks().contains(taskOne));
      //fail("Not implemented yet");
   }

   @Test
   public void testGetCompletedTasks() {
	   toDoList.addTask(taskOne);
	   toDoList.addTask(taskTwo);
	   toDoList.addTask(taskThree);
	   
	   toDoList.completeTask(stringOne);
	   toDoList.completeTask(stringThree);
	   
	   Collection<Task> completedTasks = toDoList.getCompletedTasks();
	   
	   assertTrue(completedTasks.contains(taskOne));
	   assertFalse(completedTasks.contains(taskTwo));
	   assertTrue(completedTasks.contains(taskThree));
	   //fail("Not implemented yet");
   }
}
