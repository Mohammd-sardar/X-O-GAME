import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		  Scanner cin=new Scanner(System.in);

          int answer;
          int countf=0,counts=0;
          String firstname=" ",secondname=" ";
          int game=1;
           String empty;


  System.out.println("welcome to tic tac toe game !");
  System.out.print("please enter name of first player: ");
  String onest = cin.nextLine();

  System.out.println();

  System.out.print("please enter name of second player: ");
  String twost = cin.nextLine();

  String input;

          do {

              char[][] table = {{'1', '2', '3'},
                      {'4', '5', '6'},
                      {'7', '8', '9'}};

              if(game!=1)
               empty=cin.nextLine();
              boolean checkst;

              System.out.println("Game #"+game);


             do {




                  checkst = true;
                  System.out.println();
                  System.out.print("which player want start ? (" + onest + " or " + twost + " ) : ");
                  input = cin.nextLine();


                  if (input.equals(onest)) {
                      firstname = onest;
                      secondname = twost;
                  } else if (input.equals(twost)) {
                      firstname = twost;
                      secondname = onest;
                  } else {
                      System.out.println("this name does not available , please try again :");
                      checkst = false;
                  }



               }while(checkst==false);








              System.out.println();


              int i = 1;
              int choice = -1;
              char opt = 'X';
              String player1 = " ";
              boolean x = true;


              System.out.println(firstname + " has X value");
              System.out.println(secondname + " has O value");

              System.out.println();





              while (win(table) != 1) {


                  if (i == 10)
                      break;


                  player1 = firstname;
                  opt = 'X';

                  if (i % 2 == 0) {
                      opt = 'O';
                      player1 = secondname;
                  }

                  System.out.println();


                  do {


                      printtable(table);

                      System.out.print(player1 + " which position you need to add: ");
                      choice = cin.nextInt();


                      x = true;

                      switch (choice) {

                          case 1:
                              if (table[0][0] == 'X' || table[0][0] == 'O')
                                  x = false;
                              else
                                  table[0][0] = opt;

                              break;

                          case 2:
                              if (table[0][1] == 'X' || table[0][1] == 'O')
                                  x = false;
                              else
                                  table[0][1] = opt;
                              break;


                          case 3:
                              if (table[0][2] == 'X' || table[0][2] == 'O')
                                  x = false;
                              else
                                  table[0][2] = opt;
                              break;


                          case 4:

                              if (table[1][0] == 'X' || table[1][0] == 'O')
                                  x = false;
                              else
                                  table[1][0] = opt;
                              break;

                          case 5:
                              if (table[1][1] == 'X' || table[1][1] == 'O')
                                  x = false;
                              else
                                  table[1][1] = opt;
                              break;


                          case 6:
                              if (table[1][2] == 'X' || table[1][2] == 'O')
                                  x = false;
                              else
                                  table[1][2] = opt;
                              break;


                          case 7:
                              if (table[2][0] == 'X' || table[2][0] == 'O')
                                  x = false;
                              else
                                  table[2][0] = opt;
                              break;


                          case 8:
                              if (table[2][1] == 'X' || table[2][1] == 'O')
                                  x = false;
                              else
                                  table[2][1] = opt;
                              break;


                          case 9:
                              if (table[2][2] == 'X' || table[2][2] == 'O')
                                  x = false;
                              else
                                  table[2][2] = opt;
                              break;

                          default:
                              x = false;
                              break;


                      }

                      if (x == false)
                          System.out.println("oh wrong please try again ! ");

                  } while (x == false);


                  i++;

              }


              System.out.println();

              printtable(table);


              if (win(table) == 1) {


                  if(player1==onest)
                      countf++;
                  else if(player1==twost)
                      counts++;


                  System.out.println("congratulatins " + player1 + " you  won");
              }

               else

                  System.out.println("no one :(");

              System.out.println("play again ?\nEnter 1 to play again\nEnter non 1 to exit\nType here: ");
              answer= cin.nextInt();


              game++;




          }while(answer==1);


              System.out.println(onest+" won "+countf+" games");
              System.out.println(twost+" won "+counts+" games");
              if(countf>counts)
                  System.out.println("Congratulations "+onest+" you won the award");
              else if(countf==counts)
                  System.out.println("no one has been awarded the prize");
              else
                  System.out.println("Congratulations "+twost+" you won the award");

                System.out.println("END");
      }




      public static void printtable(char [][] table )
      {


          System.out.println(table[0][0]+"|"+table[0][1]+"|" +table [0][2]);
          System.out.println("-+-+-");
          System.out.println(table[1][0]+"|"+table[1][1]+"|" +table [1][2]);
          System.out.println("-+-+-");
          System.out.println(table[2][0]+"|"+table[2][1]+"|" +table [2][2]);



      }





      public static int win(char [][] table)
      {
          int law=0;
          if((table[0][0]==table[0][1])&&(table[0][1]==table[0][2]))
              law=1;

          else if((table[1][0]==table[1][1])&&(table[1][1]==table[1][2]))
              law=1;


          else if((table[2][0]==table[2][1])&&(table[2][1]==table[2][2]))
              law=1;


          else if((table[0][0]==table[1][0])&&(table[1][0]==table[2][0]))
              law=1;

          else if((table[0][1]==table[1][1])&&(table[1][1]==table[2][1]))
              law=1;

          else if((table[0][2]==table[1][2])&&(table[1][2]==table[2][2]))
              law=1;


          else if((table[0][0]==table[1][1])&&(table[1][1]==table[2][2]))
              law=1;


else if((table[0][2]==table[1][1])&&(table[1][1]==table[2][0]))
          law=1;



          return law;




      }

  }



