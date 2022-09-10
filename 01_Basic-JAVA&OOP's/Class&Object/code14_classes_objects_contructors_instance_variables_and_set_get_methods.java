


 class Puppy {
    int puppyAge;
 
    public Puppy(String name) {
       // This constructor has one parameter, name.
       System.out.println("Name chosen is :" + name );
    }
 
    public void setAge( int age ) {
       puppyAge = age;
    }
 
    public int getAge( ) {
       System.out.println("Puppy's age is :" + puppyAge );
       return puppyAge;
    }
}
 
    public class code14_classes_objects_contructors_instance_variables_and_set_get_methods {
        public static void main(String []args) {
            /* Object creation */
            Puppy myPuppy = new Puppy( "tommy" );
      
            /* Call class method to set puppy's age */
            myPuppy.setAge( 2 );
      
            /* Call another class method to get puppy's age */
            myPuppy.getAge( );
      
            /* You can access instance variable as follows as well */
            System.out.println("Variable Value :" + myPuppy.puppyAge );
         }
    }
    
