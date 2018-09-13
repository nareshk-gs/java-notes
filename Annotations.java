Java code life scope:

  .java --> compilation --> .class --> execution

Compilation cycle:

  1.  Pre-Processor (NA in java)
  2.  Compiler
  3.  Assember
  4.  Loader/link-editor

Compiler stages:

  1.  Lexical Analysis (Buffering and tokenization)
  2.  Syntax Analysis
  3.  Semantic Analysis
  4.  Intermideiate Code Generation
  5.  Code Optimization
  6.  Code Generation

Annotations will help load code in lexical analysis phase.
Annotations are executed by using pre-defined Annotation Processing Tool (APT).

Annotation Syntaxes:
  1. Declaration Sysntax
  2. Utilization Syntax

Declaration Syntax:
  @interface <annotation_name>
  {
    <members> (data_type member_name()[default value])
  }
  
  
Utilization Syntax:
  Can be used for variables, methods, classes etc
    eg: @<annotation_name(mem1 = val1, mem2 = val2)
        programming element


Annotation Types:
  1. Marker Annotation
        - Annotation without members. Eg: @Override
  2. Singled Valued Annotation
        - Contains only one member. Eg: @SuppressWarnings("unchecked")
  3. Multi Valued Annotation
        - Contains more than one member. Eg: @WebServlet(name="myServlet", urlPattern={"/abc","/xyz"})


Classifications of Annotations:
  1. Standard Annotations
    a. General Purpose Annotations
        @Override
        @SuppressWarnings
        @Deprecated
        @FunctionalInterface
    b. Meta Annotations
        @Documented
        @Inherited
        @Target
        @Retention
  2. Custom Annotations