// Fig. 20.18: TreeTest.java
// This program tests class Tree.
import com.deitel.jhtp5.ch20.Tree;

public class TreeTest {

   public static void main( String args[] )
   {
      Tree tree = new Tree();
      int value;

      System.out.println( "Inserting the following values: " );

      // insert 10 random integers from 0-99 in tree 
      for ( int i = 1; i <= 10; i++ ) {
         value = ( int ) ( Math.random() * 100 );
         System.out.print( value + " " );
         tree.insertNode( value );
      }

      System.out.println ( "\n\nPreorder traversal" );
      tree.preorderTraversal(); // perform preorder traversal of tree

      System.out.println ( "\n\nInorder traversal" );
      tree.inorderTraversal(); // perform inorder traversal of tree

      System.out.println ( "\n\nPostorder traversal" );
      tree.postorderTraversal(); // perform postorder traversal of tree
      System.out.println();
   }

} // end class TreeTest


/**************************************************************************
 * (C) Copyright 1992-2003 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
