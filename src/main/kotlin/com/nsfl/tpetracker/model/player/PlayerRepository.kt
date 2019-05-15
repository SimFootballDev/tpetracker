package com.nsfl.tpetracker.model.player

import com.nsfl.tpetracker.model.position.Position
import com.nsfl.tpetracker.model.team.Team

class PlayerRepository {

    private val playerParser = PlayerParser()
    private val playerDatabase = PlayerDatabase()
    private val playerList = ArrayList<Player>()

    fun update() {
        playerList.clear()
        playerList.addAll(playerDatabase.updatePlayers(playerParser.parseAll()))
    }

    fun getPlayer(playerId: String) = playerList.first { it.id == playerId }

    fun getAllPlayers() = playerList

    fun getBaltimoreHawksPlayers() =
            playerList.filter { it.team == Team.BALTIMORE_HAWKS }

    fun getColoradoYetiPlayers() =
            playerList.filter { it.team == Team.COLORADO_YETI }

    fun getPhiladelphiaLibertyPlayers() =
            playerList.filter { it.team == Team.PHILADELPHIA_LIBERTY }

    fun getYellowknifeWraithsPlayers() =
            playerList.filter { it.team == Team.YELLOWKNIFE_WRAITHS }

    fun getArizonaOutlawsPlayers() =
            playerList.filter { it.team == Team.ARIZONA_OUTLAWS }

    fun getNewOrleansSecondLinePlayers() =
            playerList.filter { it.team == Team.NEW_ORLEANS_SECOND_LINE }

    fun getOrangeCountyOttersPlayers() =
            playerList.filter { it.team == Team.ORANGE_COUNTY_OTTERS }

    fun getSanJoseSabercatsPlayers() =
            playerList.filter { it.team == Team.SAN_JOSE_SABERCATS }

    fun getPalmBeachSolarBearsPlayers() =
            playerList.filter { it.team == Team.PALM_BEACH_SOLAR_BEARS }

    fun getKansasCityCoyotesPlayers() =
            playerList.filter { it.team == Team.KANSAS_CITY_COYOTES }

    fun getPortlandPythonsPlayers() =
            playerList.filter { it.team == Team.PORTLAND_PYTHONS }

    fun getNorfolkSeawolvesPlayers() =
            playerList.filter { it.team == Team.NORFOLK_SEAWOLVES }

    fun getSanAntonioMarshalsPlayers() =
            playerList.filter { it.team == Team.SAN_ANTONIO_MARSHALS }

    fun getTijuanaLuchadoresPlayers() =
            playerList.filter { it.team == Team.TIJUANA_LUCHADORES }

    fun getFreeAgents() =
            playerList.filter { it.team == Team.FREE_AGENTS }

    fun getQBProspects() =
            playerList.filter { it.team == Team.QB_PROSPECTS }

    fun getRBProspects() =
            playerList.filter { it.team == Team.RB_PROSPECTS }

    fun getWRProspects() =
            playerList.filter { it.team == Team.WR_PROSPECTS }

    fun getTEProspects() =
            playerList.filter { it.team == Team.TE_PROSPECTS }

    fun getOLProspects() =
            playerList.filter { it.team == Team.OL_PROSPECTS }

    fun getDEProspects() =
            playerList.filter { it.team == Team.DE_PROSPECTS }

    fun getDTProspects() =
            playerList.filter { it.team == Team.DT_PROSPECTS }

    fun getLBProspects() =
            playerList.filter { it.team == Team.LB_PROSPECTS }

    fun getCBProspects() =
            playerList.filter { it.team == Team.CB_PROSPECTS }

    fun getSProspects() =
            playerList.filter { it.team == Team.S_PROSPECTS }

    fun getKPProspects() =
            playerList.filter { it.team == Team.KP_PROSPECTS }

    fun getQBPlayers() =
            playerList.filter { it.position == Position.QB }

    fun getRBPlayers() =
            playerList.filter { it.position == Position.RB }

    fun getWRPlayers() =
            playerList.filter { it.position == Position.WR }

    fun getTEPlayers() =
            playerList.filter { it.position == Position.TE }

    fun getOLPlayers() =
            playerList.filter { it.position == Position.OL }

    fun getDEPlayers() =
            playerList.filter { it.position == Position.DE }

    fun getDTPlayers() =
            playerList.filter { it.position == Position.DT }

    fun getLBPlayers() =
            playerList.filter { it.position == Position.LB }

    fun getCBPlayers() =
            playerList.filter { it.position == Position.CB }

    fun getSPlayers() =
            playerList.filter { it.position == Position.S }

    fun getKPPlayers() =
            playerList.filter { it.position == Position.KP }
}