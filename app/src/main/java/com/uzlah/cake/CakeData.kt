package com.uzlah.cake

object CakeData {
    private val cakeNames = arrayOf(
        "Popcorn Caramello",
        "Chocolate Amber",
        "Chocolate Madness",
        "Ovo Milo",
        "Lychee Rose",
        "Say Cheese! Ovomaltine",
        "Say Cheese! Biscoff",
        "Colette's Garden",
        "Unicorn Cake",
        "Galaxy Cake"
    )

    private val cakePrice = arrayOf(
        "Rp 468,000",
        "Rp 468,000",
        "Rp 468,000",
        "Rp 448,000",
        "Rp 400,000",
        "Rp 448,000",
        "Rp 470,000",
        "Rp 385,000",
        "Rp 385,000",
        "Rp 400,000"
    )

    private val cakeDesc = arrayOf(
        "The iconic movie treat is re-imagined.\n" +
                "\n" +
                "Featuring a caramel popcorn overload arrangement from two waffle cones that are brushed with edible gold lustre.\n" +
                "\n" +
                "Inside is a silky caramel buttercream with almond crunch nestling between 3 layers of fluffy vanilla cake.\n" +
                "\n" +
                "An eye-catching crowd pleaser!\n" +
                "\n" +
                "Ingredients: vanilla sponge, salty butter cream,nougatine, caramel glaze, popcorn.",
        "Chocolate & Peanut Butter got all dressed up for a special occasion. \n" +
                "\n" +
                "Our rich Lola Bar cake gets covered in dark chocolate ganache and is decorated with peanut studded chocolate shards, handcrafted macarons, meringues and golden chocolate biscuit buttons. The perfect cake to gift or to celebrate with! \n" +
                "\n" +
                "Ingredients: chocolate sponge, crunchy wafer, caramel peanut,milk chocolate cream,chocolate glaze,peanut",
        "ame look with a more chocolate-y taste.\n" +
                "\n" +
                "We’ve upgraded our signature Chocolate Madness and changed the inside to that of our Chocolate Sunday. A rich chocolate cake with luscious Belgian chocolate ganache paired with a multitude of chocolate Candyland on top to make this the ultimate chocolate lover’s cake.\n" +
                "\n" +
                "Ingredients: chocolate sponge, dark couverture chocolate ganache, Oreo cookies, Take-It, Bueno, Chik Chok, chocolate macaron",
        "Our ultimate bestseller and signature cake.\n" +
                "\n" +
                "Our Ovomilo has the perfect balance of Ovomaltine and Milo which has a nice bite of crispy cereal topped with fresh Bavarian cream, milk chocolate ganache and a fluffy chocolate chiffon sponge. The outside shell has a delectable Ovomaltine glaze, which makes this cake a true favorite amongst our cake lover customers.\n" +
                "\n" +
                "Ingredients: Elmer chocomaltine, Milo, chocolate sponge cake, fresh cream, crispy wafer, dark chocolate\n" +
                "\n",
        "Some things just really go well together:\n" +
                "\n" +
                "Mornings & Coffee, Bread & Butter, and our favorite pairing, Lychee & Rose\n" +
                "\n" +
                "Re-introducing our soft rose-scented pink sponge, lychee rose buttercream, with fresh lychee pieces generously sandwiched in between.\n" +
                "\n" +
                "A delicate, fragrant flavor to remember.\n" +
                "\n" +
                "Ingredients: vanilla sponge, cream cheese, rose flavor, fresh lychee, buttercream.",
        "Our customer’s love Ovomaltine so much we just had to put our signature Ovomaltine flavor with the creaminess of our cheesecake all on top of a buttery digestive biscuit base. A match made in heaven!\n" +
                "\n" +
                "Ingredients: Cream Cheese, Fresh Milk, Fresh Cream, Yolk, Sugar, Digestive Biscuit, Home Made Ovomaltine.",
        "For the love of cheese cake! Ever wonder how cheese cake goes with the unique and legendary Lotus Biscoff? You will adore this fantastic combo. The thick and creamy cheese cake paired with a unique caramelized taste of Biscoff will surely be 2021’s Dynamic Duo.\n" +
                "\n" +
                "Ingredients: Cream Cheese, Butter Cream, Lotus Biscoff Spread, Lotus Biscoff Biscuit, Vanilla Essence, Icing Sugar, Gelatine, Silver Sprinkle",
        "Take a minute to stop, smell the roses & stroll through Colette's Garden.\n" +
                "\n" +
                "Decorated with hand-piped buttercream rose swirls & leaves in an elegant color palette; accented with gold glittering fondant butterflies to complete this beautiful floral design.\n" +
                "\n" +
                "Paired with our Signature 'Lychee Rose' cake inside.\n" +
                "\n" +
                "Ingredients: vanilla pink sponge, cream cheese rose flavor, fresh lychee,butter cream",
        "Bring a little bit of magic into your days.\n" +
                "\n" +
                "This dreamy cake will definitely whisk you away to a world where wishes comes true & Unicorns exist.\n" +
                "\n" +
                "Iced with pastel colored gradients and decorated with macarons, meringue kisses to highlight the gold Unicorn centerpiece.\n" +
                "\n" +
                "New Flavor: now paired with our delightful Banana Split cake inside. For ages 2-92.\n" +
                "\n" +
                "Occasions: Kids Birthday Parties, Baby Showers, Office Parties\n" +
                "\n" +
                "Ingredients:  banana sponge,cream cheese frosting strawberry flavor, strawberry jelly, chocolate cream, chocolate crack, butter cream.",
        "Step into another world with our multi colored galaxy cake.\n" +
                "\n" +
                "It's the perfect cake for stargazers and dreamers alike. If you want to be the talk of the party then enchant your friends with this glitter sparkling galaxy cake topped with our signature galaxy swirl macarons.\n" +
                "\n" +
                "Occasion: Adults/Kids Birthday Parties, Office Parties and Other Celebrations\n" +
                "\n" +
                "Ingredients:  chocolate sponge, dark couverture chocolate ganache."
    )

    private val cakeImages = intArrayOf(
        R.drawable.popcorn,
        R.drawable.chocolate_amber,
        R.drawable.chocolate_madness,
        R.drawable.ovomilo,
        R.drawable.lychee_rose,
        R.drawable.say_cheese_ovamaltine,
        R.drawable.lotus,
        R.drawable.colettes_garden,
        R.drawable.unicorn,
        R.drawable.galaxy_cake
    )

    val listData: ArrayList<Cake>
        get() {
            val list = arrayListOf<Cake>()
            for (position in cakeNames.indices) {
                val cake = Cake(String(), String(), Int.MAX_VALUE, String())
                cake.name = cakeNames[position]
                cake.price = cakePrice[position]
                cake.photo = cakeImages[position]
                cake.desc = cakeDesc[position]
                list.add(cake)
            }
            return list
        }
}