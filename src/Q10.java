//Tightly Coupled System: In the case of a large set of classes that all extend a single class, it results in a tightly coupled system. This can lead to several issues such as reduced modularity, decreased reusability, and increased complexity.
//
//        Reduced Code Flexibility: Having a shallow inheritance tree may restrict the potential of a class to be used in multiple scenarios. This reduces the flexibility of the code.
//
//        High Maintenance: In case of modifications in the parent class (class Z), all the subclasses will be affected. This may require significant changes across the codebase, making maintenance a complex task.
//
//        Poor Abstraction: If the parent class contains attributes or methods that are not used or relevant to the majority of subclasses, it may lead to poor abstraction and increase code complexity.
//
//        Namespace Cluttering: A large number of classes can result in a cluttered namespace, making it difficult to identify and access the desired class.
//
//        To avoid these disadvantages, it is advisable to design a class hierarchy with deeper inheritance levels. This ensures a better-organized codebase, increased flexibility, improved modularity, and reduced maintenance efforts