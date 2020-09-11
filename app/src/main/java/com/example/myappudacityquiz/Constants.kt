package com.example.myappudacityquiz

object Constants {

    fun getQuestions(): ArrayList<Questions> {
        val questionList = ArrayList<Questions>()

        val que1 = Questions(
            1,
            "What country does this flag belong to?",
            R.drawable.argentina,
            "Brasil",
            "USA",
            "Argentina",
            "Malaysia",
            3
        )
        questionList.add(que1)

        val que2 = Questions(
            2,
            "What country does this flag belong to?",
            R.drawable.brasil,
            "Island",
            "USA",
            "Argentina",
            "Turkey",
            1
        )
        questionList.add(que2)

        val que3 = Questions(3,
            "What country does this flag belong to?",
            R.drawable.britain,
            "Germany",
            "Russia",
            "Great Britain",
            "Argentina",
            3
        )
        questionList.add(que3)

        val que4 = Questions(4,
            "What country does this flag belong to?",
            R.drawable.canada,
            "Russia",
            "USA",
            "Great Britain",
            "Canada",
            4
        )
        questionList.add(que4)

        return questionList
    }

}