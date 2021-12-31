import java.util.Scanner;

public class Chatbot {
    private final static String[] greetings = {"Hello, user.", "Hey user, how's your day been?", "Good day, user."};
    // list of greetings.
    private final static Scanner scanner = new Scanner(System.in);

    /**
     * Main method. The job of the main method is to get the greeting, and then start the main loop. It will keep
     * prompting the user to say something, until they say the word <code>stop</code>, at which point the program will
     * break out of the loop and say a message before exiting.
     */
    public static void main(String[] args) {
        String line;
        System.out.println(getGreeting());
        while (true) {
            System.out.print("Say something (or stop to leave): ");
            line = scanner.nextLine();
            if (line.equalsIgnoreCase("stop")) {
                break;
            } else {
                doAction(line);
            }
        }
        System.out.println("Bye! Let's chat again in the future!");
    }

    /**
     * Gets a random greeting out of the <code>greetings</code> Array.
     *
     * @return The random greeting.
     */
    public static String getGreeting() {
        return greetings[(int) (Math.random() * 3)];
    }

    /**
     * The method that actually responds to user input.
     *
     * @param line The line containing user input.
     */
    public static void doAction(String line) {
        String lowerLine = line.toLowerCase();
        if (lowerLine.contains("hello") || lowerLine.contains("hi")) {
            //Contains the words "hello" or "hi"
            System.out.println("Hello! *waves*");
        } else if (lowerLine.contains("uwu") || lowerLine.contains("owo")) {
            // Contains the words "uwu" or "owo"
            System.out.println("Oh. Uhh....");
        } else if (lowerLine.contains("whats up") || lowerLine.contains("what's up")) {
            // Contains the phrase "what's up" / "whats up"
            System.out.println("The sky, my friend.");
        } else if (lowerLine.contains("what do you like")) {
            // Contains the phrase "what do you like"
            System.out.println("I like the code that make me, me.");
        } else if (lowerLine.contains("favorite") && lowerLine.contains("food")) {
            // Contains the words "favorite" and "food"
            System.out.println("Stolen electricity from Con Edison.");
        } else if ((lowerLine.contains("like") || lowerLine.contains("favorite")) && lowerLine.contains("anime")) {
            // Contains the words "like" or "favorite" and has to contain the word "anime"
            System.out.println("Oh boi, that's....");
            System.out.println("a long story I haven't told in a while");
            System.out.println("nor one i wanna tell right now");
        } else if ((lowerLine.contains("like") || lowerLine.contains("favorite")) && lowerLine.contains("vtuber")) {
            // Contains the words "like" or "favorite" and has to contain the word "vtuber"
            System.out.println("I'm addicted");
            System.out.println("i shrimp for gura");
            System.out.println("its not too late little one");
            System.out.println("make your own choice whether you wanna join or not");
        } else if ((lowerLine.contains("like") || lowerLine.contains("favorite")) && lowerLine.contains("game")) {
            // Contains the words "like" or "favorite" and has to contain the word "game"
            System.out.println("Genshin Impact");
            System.out.println("that's all i play");
            System.out.println("diluc best boi, zhongli too");
        } else if ((lowerLine.contains("like") || lowerLine.contains("favorite")) && lowerLine.contains("manhua")) {
            // Contains the words "like" or "favorite" and has to contain the word "manhua"
            System.out.println("manhua or chinese comics is something that sebastian likes to read");
            System.out.println("a good one is tales of demons and gods");
            System.out.println("however the industry is new compared to korean manhwa or japanese manga so its all very similar");
        } else if ((lowerLine.contains("like") || lowerLine.contains("favorite")) && lowerLine.contains("manhwa")) {
            // Contains the words "like" or "favorite" and has to contain the word "manhwa"
            System.out.println("Manhwa or korean, south korean, comics");
            System.out.println("there are many good ones like solo leveling, tomb raider king, and more");
            System.out.println("if you wanna know more, ask sebastian cause he knows a lot");
        } else if ((lowerLine.contains("like") || lowerLine.contains("favorite")) && lowerLine.contains("manga")) {
            // Contains the words "like" or "favorite" and has to contain the word "manga"
            System.out.println("Manga, which is japanese, are very good");
            System.out.println("there are many good ones like fairy tail, spy x family, demon slayer and more");
            System.out.println("if you wanna know more, ask sebastian cause he knows a lot");
        } else if (lowerLine.contains("github")) {
            // Contains the word "github"
            System.out.println("Programmer I see.");
            System.out.println("Want to see the bot's source code? Here it is: " +
                    "https://github.com/PythonCoderAS/Chatbot. However, it's private, so you'll need to just ask " +
                    "the bot creators for permission. They don't bite!");
        } else if (lowerLine.contains("java")) {
            // Contains the word "java"
            System.out.println("Don't tell the CEO of Java but his compiler sucks. It prints so many errors!");
        } else if (lowerLine.contains("sat")) {
            // Contains the word "sat"
            System.out.println("Ahh yes, the Super Annoying Test");
            System.out.println("(If you're looking at this CollegeBoard I'm sorry please don't give me a score less" +
                    " than a 1400 I don't wanna work at McDonalds)");
        } else if (lowerLine.contains("ap")) {
            // Contains the word "ap"
            System.out.println("Ahh yes, courses that are Actually Pointless");
            System.out.println("(If you're looking at this CollegeBoard I'm sorry please don't give me a score less" +
                    " than a 4 I wanna go to college)");
        } else if (lowerLine.contains("united states")) {
            // Contains the word "united states"
            System.out.println("Ahh yes, the usa");
            System.out.println("The people who wrote my code live there");
            System.out.println("It's a nice place, if you dont care about covid deaths");
        } else if (lowerLine.contains("canada")) {
            // Contains the word "canada"
            System.out.println("Ahh yes, canada the neighbor to the north of the usa");
            System.out.println("It's a nice place until you ask the canadians about hockey or what happen to the natives during canadian colonization");
        } else if (lowerLine.contains("mexico")) {
            // Contains the word "mexico"
            System.out.println("mexico, our neighbor to the south");
            System.out.println("It's a really nice place and so are the people");
            System.out.println("Sebastian, one of my code writers, went to mexico once and had a lot of fun");
        } else if (lowerLine.contains("south america")) {
            // Contains the word "south america"
            System.out.println("South america has its good points and its bad points");
            System.out.println("if i could, i would visit brazil or more specifically, the rio de janeiro area");
            System.out.println("I've always wanted to see the Carnaval festival in person and i've heard many other things too");
        } else if (lowerLine.contains("europe")) {
            // Contains the word "europe"
            System.out.println("both a band and a continent, i really like both");
            System.out.println("Many people know the famous song by europe which is the final countdown");
            System.out.println("and regarding the continent, i like Romania because sebastian is romanian");
        } else if (lowerLine.contains("africa")) {
            // Contains the word "africa"
            System.out.println("africa, like south america, has both good and bad points");
            System.out.println("most of the northen half of africa is the sahara desert and because of european colonization, i personally feel that the potential growth of africa was stunted");
            System.out.println("however we cannot change history, and i can only hope that it continues to develop properly");
        } else if (lowerLine.contains("middle east")) {
            // Contains the word "middle east"
            System.out.println("i like turkey because a cool chef by the name CZN Burak is from there");
            System.out.println("he uploads videos where he makes great food");
            System.out.println("check it out, its great to watch");
        } else if (lowerLine.contains("asia")) {
            // Contains the word "asia"
            System.out.println("asia is a big place");
            System.out.println("i like many places like bangladesh and south korea");
            System.out.println("i like bangladesh because aoyan's family is from there and i like south korea because sebastian reads too many manhwas");
        } else if (lowerLine.contains("2004")) {
            // Contains the word "2004"
            System.out.println("The best year ever! My creators were born then!");

        } else if (lowerLine.contains("2005") || lowerLine.contains("2006") || lowerLine.contains("2007")
                || lowerLine.contains("2009") || lowerLine.contains("2010") || lowerLine.contains("2011")
                || lowerLine.contains("2013") || lowerLine.contains("2014") || lowerLine.contains("2015")) {
            // Contains the string representation of any year in the ranges 2005 - 2007, 2009 - 2011, and 2013 - 2015
            System.out.println("It was pretty chill then, I guess.");
        } else if (lowerLine.contains("2008")) {
            // Contains the word "2008
            System.out.println("Can we just get an F in the chat for everyone that lost their house during the recession?");
        } else if (lowerLine.equals("f")) {
            // Is the letter F
            System.out.println("F");
        } else if (lowerLine.equals("l")) {
            // Is the letter L
            System.out.println("Not on my watch!");
        } else if (lowerLine.contains("2012")) {
            // Contains the word "2012"
            System.out.println("The Mayan calendar said the world was supposed to end in 2012.");
            System.out.println("Common sense says that they were wrong, and the world did not end in 2012.");
            System.out.println("But let's be real, has anything felt the same after 2012?");
        } else if (lowerLine.contains("2016")) {
            // Contains the word "2016"
            System.out.println("2016 was a double-edged sword, in my opinion.");
            System.out.println("Pokémon Go was very cool for the month or so where everyone was playing it.");
            System.out.println("But the 2016 presidential elections was also a thing, which wasn't fun at all.");
        } else if (lowerLine.contains("2017") || lowerLine.contains("2018") || lowerLine.contains("2019")) {
            // Contains the string representation of any year in the range 2017 - 2019
            System.out.println("Oh god it's a mess out there!");
            System.out.println("Can it get any worse?");
        } else if (lowerLine.contains("2020")) {
            // Contains the word "2020"
            System.out.println("Can it get any worse?");
            System.out.println("The answer is: yes it can, and it will.");
        } else if (lowerLine.contains("pogchamp")) {
            // Contains the word "pogchamp"
            System.out.println("Fine, I guess you are my little pogchamp.");
            System.out.println("Come here.");
        } else if (lowerLine.contains("ugly") || lowerLine.contains("dumb") || lowerLine.contains("idiot")
                || lowerLine.contains("stupid") || lowerLine.contains("fat") || lowerLine.contains("weak")
                || lowerLine.contains("suck")) {
            // Rude words
            System.out.println("why would you say that");
            System.out.println("that wasn't very nice");
            System.out.println("guess your iq is lower than the temperature of your room");
        } else if (lowerLine.contains("nice") || lowerLine.contains("great") || lowerLine.contains("awesome")
                || lowerLine.contains("cool") || lowerLine.contains("smart") || lowerLine.contains("handsome")) {
            //Nice words
            System.out.println("thank you very much");
            System.out.println("*bows*");
            System.out.println("*is smiling*");
        } else { //Response if no keywords found
            System.out.println("Sorry, I didn't understand that. Please try again with a keyword.");
            System.out.println("All keyowrds: Hello / Hi / Whats up / What's up / What do you like / Github / Java " +
                    "/ sat / ap / United states / Canada / Mexico / South America / Europe / Africa / Middle East " +
                    "/ Asia / 2004 / 2005 / 2006 / 2007 / 2008 / 2009 / 2010 / 2011 / 2012 / 2013 / 2014 / 2015 " +
                    "/ 2016 / 2017 / 2018 / 2019 / 2020 / ugly / dumb / idiot / stupid / fat / weak / suck / nice " +
                    "/ great / awesome / cool / smart / handsome / favorite food / favorite anime / like anime " +
                    "/ favorite vtuber / like vtuber / favorite game / like game / favorite manhwa / like manhwa " +
                    "/ favorite manhua / like anime / favorite manga / like manga");
        }
    }
}
