����   A l  pacote/FASE1  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lpacote/FASE1; criarInimigoFase1RPG ()Lpacote/Personagem;  pacote/Personagem   Big Trash @i      @4      @$      @D      
     (Ljava/lang/String;DDDDD)V IntruducaoFase	 ! # " java/lang/System $ % out Ljava/io/PrintStream; ' .
������ FASE 1: A ameaça do Big Trash ������ 
 ) + * java/io/PrintStream , - println (Ljava/lang/String;)V / ;Um monstro feito de lixo toxico surgiu na Avenida Paulista. 1 DEle esta espalhando poluição e ameaçando a saúde da população! 3 -Você deve derrotá-lo para salvar São Paulo iniciarFase )(Lpacote/Personagem;Ljava/util/Scanner;)V
  7  
  9  
  ; < = getNome ()Ljava/lang/String;   ? @ A makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String;  ?  ?  ?  ? G 
������ Combate iniciado!
 I K J 
pacote/RPG L M combate <(Lpacote/Personagem;Lpacote/Personagem;Ljava/util/Scanner;)V heroi Lpacote/Personagem; scanner Ljava/util/Scanner; inimigo 
SourceFile 
FASE1.java BootstrapMethods
 W Y X $java/lang/invoke/StringConcatFactory @ Z �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; V ] >
������ : Hahaha! Eu sou Big Trash, o criador do caos urbano! _ R������ : Com meu hálito tóxico e minha armadura de lixo, ninguém vai me parar! a K������ : Tóxico? Você devia ser interditado pela vigilância sanitária! c 6������ : Chega de papo! Prepare-se para o meu ataque! e (������ : Eu vou te reciclar, Big Trash! InnerClasses h %java/lang/invoke/MethodHandles$Lookup j java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	       7      � Y    � �    
       
       	       Q      !�  &� (�  .� (�  0� (�  2� (�    
                       	 4 5     �     a� 6M� 8�  ,� :� >  � (�  ,� :� B  � (�  *� :� C  � (�  ,� :� D  � (�  *� :� E  � (�  F� (*,+� H�    
   * 
          %  4   C ! R " Z % ` &         a N O     a P Q   ] R O   S    T U      [  \ [  ^ [  ` [  b [  d f   
  g i k 