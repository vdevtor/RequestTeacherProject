package com.example.requestprofessorproject.model.Bussiness

class MainMenuBussiness {

    fun getUser(): List<User> {

        val userlistB = mutableListOf<User>()

        val user1 = User(
            "https://ak.picdn.net/shutterstock/videos/26778211/thumb/1.jpg",
            "https://randomuser.me/api/portraits/men/33.jpg",
            "Carlos Martins",
            "26",
            "Contabilidade",
            "Formado na Fmu, fiz mestrado em miami, Trabalho como professor há mais de 3 anos e estou atualmente disponivel",
        "(57) 933456879","cmartins78","Mexico, Puenta Del Leste ")
        val user2 = User(
            "https://www.calvertjournal.com/images/uploads/features/2018/WC/Moscow/urban/1a.jpg",
            "https://randomuser.me/api/portraits/women/53.jpg",
            "Clara Cristina",
            "33",
            "Pedagogia",
            "Professora há 6 anos, adoro lidar com crianças, sei que é o periodo onde estão construindo a ideia que terão do mundo",
        "(11) 978452211","clarinhayes","Espanha  Madrid - RN")
        val user3 = User(
            "https://ak.picdn.net/shutterstock/videos/30593209/thumb/1.jpg",
            "https://randomuser.me/api/portraits/women/24.jpg",
            "Cristina McLauren",
            "23",
            "Professora de Inglês",
            "",
        "(88) 944215633","mccrilaren92","Brasil, Rio de Janeiro - Rj")

        val user4 = User(
            "https://www.tripsavvy.com/thmb/zxqI-j2TmNWC4ByamB2pA4djNu0=/2121x1193/smart/filters:no_upscale()/GettyImages-632210003-575832ed3df78c9b46acd4d5.jpg",
            "https://randomuser.me/api/portraits/men/54.jpg",
            "Paulo Coelho",
            "27",
            "Profechor Quimica",
            "","","","")

        val user5 = User(
            "https://1.bp.blogspot.com/-241AthaCBCU/VrYz_wL9c3I/AAAAAAAB3C8/8wZ1wFIm39s/s1600/Spain%2B-%2BMadrid%2B2016-01-02%2B%252828%2529.jpg",
            "https://randomuser.me/api/portraits/men/9.jpg",
            "Juan Diaz",
            "36",
            "Professor de Medicina",
            "",
        "","","")


        val user6 = User(
            "https://ak.picdn.net/shutterstock/videos/26778211/thumb/1.jpg",
            "https://randomuser.me/api/portraits/men/33.jpg",
            "Carlos Martins",
            "26",
            "Contabilidade",
            "Formado na Fmu, fiz mestrado em miami, Trabalho como professor há mais de 3 anos e estou atualmente disponivel"
        ,"","","")


        val user7 = User(
            "https://ak.picdn.net/shutterstock/videos/30593209/thumb/1.jpg",
            "https://randomuser.me/api/portraits/women/24.jpg",
            "Cristina McLauren",
            "23",
            "Professora de Inglês",
            ""
        ,"","","")

        val user8 = User(
            "https://www.irishtimes.com/polopoly_fs/1.2472834.1513855208!/image/image.jpg_gen/derivatives/box_620_330/image.jpg",
            "https://randomuser.me/api/portraits/men/4.jpg",
            "Ken Yagami Shougun",
            "40",
            "Relações Internacionais",
            ""
        ,"","","")

        userlistB.addAll(mutableListOf(user1,user2,user3,user4,user5,user6,user7,user8))
        return userlistB
    }
}