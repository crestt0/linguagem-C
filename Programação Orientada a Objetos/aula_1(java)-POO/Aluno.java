����   = V  aula1_java/Aluno  java/lang/Object nome Ljava/lang/String; 
prontuario I idade endereco curso scanner Ljava/util/Scanner; <init> ()V Code
      java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     LineNumberTable LocalVariableTable this Laula1_java/Aluno; aprender	  & ' ( out Ljava/io/PrintStream; * digite uma informacao: 
 , . - java/io/PrintStream / 0 println (Ljava/lang/String;)V
  2 3 4 nextLine ()Ljava/lang/String; 6 java/lang/StringBuilder 8 eu aprendi que 
 5 :  0
 5 < = > append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 5 @ A 4 toString info responder_exercicio E entre com um numero A: 
  G H I nextInt ()I K entre com um numero B:  M a soma deles e: 
 5 O = P (I)Ljava/lang/StringBuilder; 	resultado A B 
SourceFile 
Aluno.java !                 	     
                      E     *� *� Y� � � �                 !        " #    $      g     '� %)� +*� � 1L� %� 5Y7� 9+� ;� ?� +�                 &  !       ' " #     B    C      �     ;� %D� +*� � F=� %J� +*� � F>`<� %� 5YL� 9� N� ?� +�                      $  :  !   *    ; " #   $  Q    + R      S    T    U