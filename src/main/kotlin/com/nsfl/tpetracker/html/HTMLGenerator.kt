package com.nsfl.tpetracker.html

import com.nsfl.tpetracker.model.player.Player
import com.nsfl.tpetracker.model.team.Team

private const val INDEX_HTML = "<!doctypehtml><title>TPE Tracker</title><link href=https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css rel=stylesheet><script src=https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.bundle.min.js></script><br><br><div class=container><div class=row><a class=\"col-md-6 mb-4 col-xl-6\"href=/all_players><div class=\"border-0 card shadow\"><img class=card-img-top src=\"\"><div class=\"card-body text-center\"><br><h5 class=\"card-title mb-0\">All Players</h5><br></div></div></a><a class=\"col-md-6 mb-4 col-xl-6\"href=/team_stats><div class=\"border-0 card shadow\"><img class=card-img-top src=\"\"><div class=\"card-body text-center\"><br><h5 class=\"card-title mb-0\">Team Stats</h5><br></div></div></a></div></div><br><div class=container><div class=row><a class=\"col-md-6 mb-4 col-xl-4\"href=/baltimore_hawks><div class=\"border-0 card shadow\"><img class=card-img-top src=https://i.imgur.com/V7b1IrD.png><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">Baltimore Hawks</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/colorado_yeti><div class=\"border-0 card shadow\"><img class=card-img-top src=https://i.imgur.com/F82SkOe.png><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">Colorado Yeti</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/philadelphia_liberty><div class=\"border-0 card shadow\"><img class=card-img-top src=https://i.imgur.com/e26kJIj.png><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">Philadelphia Liberty</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/yellowknife_wraiths><div class=\"border-0 card shadow\"><img class=card-img-top src=https://i.imgur.com/HTNIYcS.png><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">Yellowknife Wraiths</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/arizona_outlaws><div class=\"border-0 card shadow\"><img class=card-img-top src=https://i.imgur.com/Run36h3.png><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">Arizona Outlaws</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/new_orleans_second_line><div class=\"border-0 card shadow\"><img class=card-img-top src=https://i.imgur.com/39Pv6j6.png><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">New Orleans Second Line</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/orange_county_otters><div class=\"border-0 card shadow\"><img class=card-img-top src=https://i.imgur.com/A1jDLTx.png><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">Orange County Otters</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/san_jose_sabercats><div class=\"border-0 card shadow\"><img class=card-img-top src=https://i.imgur.com/WKAzCvY.png><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">San Jose SaberCats</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/pasta><div class=\"border-0 card shadow\"><img class=card-img-top src=https://i.imgur.com/A0LezPb.png><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">Washington Admirals</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/pasta><div class=\"border-0 card shadow\"><img class=card-img-top src=https://i.imgur.com/A0LezPb.png><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">Honolulu Islanders</h5></div></div></a></div></div><br><div class=container><div class=row><a class=\"col-md-6 mb-4 col-xl-4\"href=/palm_beach_solar_bears><div class=\"border-0 card shadow\"><img class=card-img-top src=https://i.imgur.com/FW3Ewsh.png><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">Palm Beach Solar Bears</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/kansas_city_coyotes><div class=\"border-0 card shadow\"><img class=card-img-top src=https://i.imgur.com/8ZFoMpk.png><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">Kansas City Coyotes</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/portland_pythons><div class=\"border-0 card shadow\"><img class=card-img-top src=https://i.imgur.com/g1jBrkG.png><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">Portland Pythons</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/norfolk_seawolves><div class=\"border-0 card shadow\"><img class=card-img-top src=https://i.imgur.com/rUbmsUh.png><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">Norfolk SeaWolves</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/san_antonio_marshals><div class=\"border-0 card shadow\"><img class=card-img-top src=https://i.imgur.com/FL05wyS.png><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">San Antonio Marshals</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/tijuana_luchadores><div class=\"border-0 card shadow\"><img class=card-img-top src=https://i.imgur.com/Rqa9DsX.png><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">Tijuana Luchadores</h5></div></div></a></div></div><br><div class=container><div class=row><a class=\"col-md-6 mb-4 col-xl-4\"href=/free_agents><div class=\"border-0 card shadow\"><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">Free Agents</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/qb_prospects><div class=\"border-0 card shadow\"><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">QB Prospects</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/rb_prospects><div class=\"border-0 card shadow\"><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">RB Prospects</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/wr_prospects><div class=\"border-0 card shadow\"><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">WR Prospects</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/te_prospects><div class=\"border-0 card shadow\"><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">TE Prospects</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/ol_prospects><div class=\"border-0 card shadow\"><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">OL Prospects</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/de_prospects><div class=\"border-0 card shadow\"><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">DE Prospects</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/dt_prospects><div class=\"border-0 card shadow\"><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">DT Prospects</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/lb_prospects><div class=\"border-0 card shadow\"><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">LB Prospects</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/cb_prospects><div class=\"border-0 card shadow\"><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">CB Prospects</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/s_prospects><div class=\"border-0 card shadow\"><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">S Prospects</h5></div></div></a><a class=\"col-md-6 mb-4 col-xl-4\"href=/kp_prospects><div class=\"border-0 card shadow\"><div class=\"card-body text-center\"><h5 class=\"card-title mb-0\">K/P Prospects</h5></div></div></a></div></div><br><br>"
private const val ALL_PLAYERS_HTML = "<!doctypehtml><title>%s</title><link href=https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.1/semantic.min.css rel=stylesheet><link href=https://cdn.datatables.net/1.10.19/css/dataTables.semanticui.min.css rel=stylesheet><link href=https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css rel=stylesheet><script src=https://code.jquery.com/jquery-3.3.1.js></script><script src=https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js></script><script src=https://cdn.datatables.net/1.10.19/js/dataTables.semanticui.min.js></script><script src=https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.1/semantic.min.js></script><script src=https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.bundle.min.js></script><script src=https://cdn.datatables.net/plug-ins/1.10.19/sorting/enum.js></script><script class=init>var dataSet=[%s];$(document).ready(function(){$.fn.dataTable.enum( ['Quarterback','Running Back','Wide Receiver','Tight End','Offensive Line','Defensive End','Defensive Tackle','Linebacker','Cornerback','Safety','Kicker/Punter','Unknown'] );$('#table').DataTable({paging:false,order: [[4, \"desc\"]],data:dataSet,columns:[{ title: 'Draft Year' }, { title: 'Team' }, { title: 'Name' }, { title: 'Position' }, { title: 'TPE' }]})});</script><style>div{padding-left:5%%;padding-right:5%%;padding-top:.5%%;padding-bottom:.5%%}</style><nav class=\"bg-light navbar navbar-expand-lg navbar-light rounded\"><button aria-controls=navbar aria-expanded=false aria-label=\"Toggle navigation\"class=\"collapsed navbar-toggler\"data-target=#navbar data-toggle=collapse type=button><span class=navbar-toggler-icon></span></button><div class=\"collapse navbar-collapse\"id=navbar><ul class=\"mr-auto navbar-nav\"><li class=\"nav-item active\"><a class=nav-link href=/ >Home</a><li class=nav-item><a class=nav-link href=/all_players>All Players</a><li class=nav-item><a class=nav-link href=/team_stats>Team Stats</a><li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\"href=NSFL aria-expanded=false aria-haspopup=true data-toggle=dropdown id=nsfl>NSFL</a><div class=dropdown-menu aria-labelledby=nsfl><a class=dropdown-item href=/baltimore_hawks>Baltimore Hawks</a><a class=dropdown-item href=/colorado_yeti>Colorado Yeti</a><a class=dropdown-item href=/philadelphia_liberty>Philadelphia Liberty</a><a class=dropdown-item href=/yellowknife_wraiths>Yellowknife Wraiths</a><a class=dropdown-item href=/arizona_outlaws>Arizona Outlaws</a><a class=dropdown-item href=/new_orleans_second_line>New Orleans Second Line</a><a class=dropdown-item href=/orange_county_otters>Orange County Otters</a><a class=dropdown-item href=/san_jose_sabercats>San Jose SaberCats</a><a class=dropdown-item href=\"/pasta\">Washington Admirals</a><a class=dropdown-item href=\"/pasta\">Honolulu Islanders</a></div><li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\"href=DSFL aria-expanded=false aria-haspopup=true data-toggle=dropdown id=dsfl>DSFL</a><div class=dropdown-menu aria-labelledby=dsfl><a class=dropdown-item href=/palm_beach_solar_bears>Palm Beach Solar Bears</a><a class=dropdown-item href=/kansas_city_coyotes>Kansas City Coyotes</a><a class=dropdown-item href=/portland_pythons>Portland Pythons</a><a class=dropdown-item href=/norfolk_seawolves>Norfolk SeaWolves</a><a class=dropdown-item href=/san_antonio_marshals>San Antonio Marshals</a><a class=dropdown-item href=/tijuana_luchadores>Tijuana Luchadores</a></div><li class=nav-item><a class=nav-link href=/free_agents>Free Agents</a><li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\"href=Prospects aria-expanded=false aria-haspopup=true data-toggle=dropdown id=prospects>Prospects</a><div class=dropdown-menu aria-labelledby=prospects><a class=dropdown-item href=/qb_prospects>QB Prospects</a><a class=dropdown-item href=/rb_prospects>RB Prospects</a><a class=dropdown-item href=/wr_prospects>WR Prospects</a><a class=dropdown-item href=/te_prospects>TE Prospects</a><a class=dropdown-item href=/ol_prospects>OL Prospects</a><a class=dropdown-item href=/de_prospects>DE Prospects</a><a class=dropdown-item href=/dt_prospects>DT Prospects</a><a class=dropdown-item href=/lb_prospects>LB Prospects</a><a class=dropdown-item href=/cb_prospects>CB Prospects</a><a class=dropdown-item href=/s_prospects>S Prospects</a><a class=dropdown-item href=/kp_prospects>K/P Prospects</a></div></ul></div></nav><div><table class=\"celled table ui\"id=table width=100%%></table></div>"
private const val INDIVIDUAL_PLAYER_HTML = "<!doctypehtml><title>%s</title><link href=https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.1/semantic.min.css rel=stylesheet><link href=https://cdn.datatables.net/1.10.19/css/dataTables.semanticui.min.css rel=stylesheet><link href=https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css rel=stylesheet><script src=https://code.jquery.com/jquery-3.3.1.js></script><script src=https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js></script><script src=https://cdn.datatables.net/1.10.19/js/dataTables.semanticui.min.js></script><script src=https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.1/semantic.min.js></script><script src=https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.bundle.min.js></script><script src=https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js></script><style>div{padding-left:5%%;padding-right:5%%;padding-top:.5%%;padding-bottom:.5%%}</style><nav class=\"bg-light navbar navbar-expand-lg navbar-light rounded\"><button aria-controls=navbar aria-expanded=false aria-label=\"Toggle navigation\"class=\"collapsed navbar-toggler\"data-target=#navbar data-toggle=collapse type=button><span class=navbar-toggler-icon></span></button><div class=\"collapse navbar-collapse\"id=navbar><ul class=\"mr-auto navbar-nav\"><li class=\"nav-item active\"><a class=nav-link href=/>Home</a><li class=nav-item><a class=nav-link href=/all_players>All Players</a><li class=nav-item><a class=nav-link href=/team_stats>Team Stats</a><li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\"href=NSFL aria-expanded=false aria-haspopup=true data-toggle=dropdown id=nsfl>NSFL</a><div class=dropdown-menu aria-labelledby=nsfl><a class=dropdown-item href=/baltimore_hawks>Baltimore Hawks</a><a class=dropdown-item href=/colorado_yeti>Colorado Yeti</a><a class=dropdown-item href=/philadelphia_liberty>Philadelphia Liberty</a><a class=dropdown-item href=/yellowknife_wraiths>Yellowknife Wraiths</a><a class=dropdown-item href=/arizona_outlaws>Arizona Outlaws</a><a class=dropdown-item href=/new_orleans_second_line>New Orleans Second Line</a><a class=dropdown-item href=/orange_county_otters>Orange County Otters</a><a class=dropdown-item href=/san_jose_sabercats>San Jose SaberCats</a><a class=dropdown-item href=\"/pasta\">Washington Admirals</a><a class=dropdown-item href=\"/pasta\">Honolulu Islanders</a></div><li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\"href=DSFL aria-expanded=false aria-haspopup=true data-toggle=dropdown id=dsfl>DSFL</a><div class=dropdown-menu aria-labelledby=dsfl><a class=dropdown-item href=/palm_beach_solar_bears>Palm Beach Solar Bears</a><a class=dropdown-item href=/kansas_city_coyotes>Kansas City Coyotes</a><a class=dropdown-item href=/portland_pythons>Portland Pythons</a><a class=dropdown-item href=/norfolk_seawolves>Norfolk SeaWolves</a><a class=dropdown-item href=/san_antonio_marshals>San Antonio Marshals</a><a class=dropdown-item href=/tijuana_luchadores>Tijuana Luchadores</a></div><li class=nav-item><a class=nav-link href=/free_agents>Free Agents</a><li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\"href=Prospects aria-expanded=false aria-haspopup=true data-toggle=dropdown id=prospects>Prospects</a><div class=dropdown-menu aria-labelledby=prospects><a class=dropdown-item href=/qb_prospects>QB Prospects</a><a class=dropdown-item href=/rb_prospects>RB Prospects</a><a class=dropdown-item href=/wr_prospects>WR Prospects</a><a class=dropdown-item href=/te_prospects>TE Prospects</a><a class=dropdown-item href=/ol_prospects>OL Prospects</a><a class=dropdown-item href=/de_prospects>DE Prospects</a><a class=dropdown-item href=/dt_prospects>DT Prospects</a><a class=dropdown-item href=/lb_prospects>LB Prospects</a><a class=dropdown-item href=/cb_prospects>CB Prospects</a><a class=dropdown-item href=/s_prospects>S Prospects</a><a class=dropdown-item href=/kp_prospects>K/P Prospects</a></div></ul></div></nav><div class=container><div><br><h1><a href=%s>%s</a></h1><h4><a href=%s>%s</a></h4><h6>%s</h6><br></div><div><canvas id=myChart></canvas></div></div><script>;var ctx=document.getElementById('myChart'),myChart=new Chart(ctx,{type:'line',data:{labels:[%s],datasets:[{label:'TPE',lineTension:0,data:[%s]}]},options:{responsive:!0,title:{display:!0,text:'TPE History'},legend:{display:!1},tooltips:{mode:'index',intersect:!1,callbacks:{label:function(e){return e.yLabel}}},hover:{mode:'nearest',intersect:!0},scales:{yAxes:[{ticks:{min:0}}]}}});</script>"
private const val TEAM_STATS_HTML = "<!doctypehtml><title>%s</title><link href=https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.1/semantic.min.css rel=stylesheet><link href=https://cdn.datatables.net/1.10.19/css/dataTables.semanticui.min.css rel=stylesheet><link href=https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css rel=stylesheet><script src=https://code.jquery.com/jquery-3.3.1.js></script><script src=https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js></script><script src=https://cdn.datatables.net/1.10.19/js/dataTables.semanticui.min.js></script><script src=https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.1/semantic.min.js></script><script src=https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.bundle.min.js></script><script class=init>var dataSet=[%s];$(document).ready(function(){$('#table').DataTable({paging:false,order: [[0, \"desc\"]],data:dataSet,columns:[{ title: 'League' }, { title: 'Name' }, { title: 'Total TPE' }, { title: 'Total Effective TPE' }, { title: 'Average TPE' }]})});</script><style>div{padding-left:5%%;padding-right:5%%;padding-top:.5%%;padding-bottom:.5%%}</style><nav class=\"bg-light navbar navbar-expand-lg navbar-light rounded\"><button aria-controls=navbar aria-expanded=false aria-label=\"Toggle navigation\"class=\"collapsed navbar-toggler\"data-target=#navbar data-toggle=collapse type=button><span class=navbar-toggler-icon></span></button><div class=\"collapse navbar-collapse\"id=navbar><ul class=\"mr-auto navbar-nav\"><li class=\"nav-item active\"><a class=nav-link href=/ >Home</a><li class=nav-item><a class=nav-link href=/all_players>All Players</a><li class=nav-item><a class=nav-link href=/team_stats>Team Stats</a><li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\"href=NSFL aria-expanded=false aria-haspopup=true data-toggle=dropdown id=nsfl>NSFL</a><div class=dropdown-menu aria-labelledby=nsfl><a class=dropdown-item href=/baltimore_hawks>Baltimore Hawks</a><a class=dropdown-item href=/colorado_yeti>Colorado Yeti</a><a class=dropdown-item href=/philadelphia_liberty>Philadelphia Liberty</a><a class=dropdown-item href=/yellowknife_wraiths>Yellowknife Wraiths</a><a class=dropdown-item href=/arizona_outlaws>Arizona Outlaws</a><a class=dropdown-item href=/new_orleans_second_line>New Orleans Second Line</a><a class=dropdown-item href=/orange_county_otters>Orange County Otters</a><a class=dropdown-item href=/san_jose_sabercats>San Jose SaberCats</a><a class=dropdown-item href=\"/pasta\">Washington Admirals</a><a class=dropdown-item href=\"/pasta\">Honolulu Islanders</a></div><li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\"href=DSFL aria-expanded=false aria-haspopup=true data-toggle=dropdown id=dsfl>DSFL</a><div class=dropdown-menu aria-labelledby=dsfl><a class=dropdown-item href=/palm_beach_solar_bears>Palm Beach Solar Bears</a><a class=dropdown-item href=/kansas_city_coyotes>Kansas City Coyotes</a><a class=dropdown-item href=/portland_pythons>Portland Pythons</a><a class=dropdown-item href=/norfolk_seawolves>Norfolk SeaWolves</a><a class=dropdown-item href=/san_antonio_marshals>San Antonio Marshals</a><a class=dropdown-item href=/tijuana_luchadores>Tijuana Luchadores</a></div><li class=nav-item><a class=nav-link href=/free_agents>Free Agents</a><li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\"href=Prospects aria-expanded=false aria-haspopup=true data-toggle=dropdown id=prospects>Prospects</a><div class=dropdown-menu aria-labelledby=prospects><a class=dropdown-item href=/qb_prospects>QB Prospects</a><a class=dropdown-item href=/rb_prospects>RB Prospects</a><a class=dropdown-item href=/wr_prospects>WR Prospects</a><a class=dropdown-item href=/te_prospects>TE Prospects</a><a class=dropdown-item href=/ol_prospects>OL Prospects</a><a class=dropdown-item href=/de_prospects>DE Prospects</a><a class=dropdown-item href=/dt_prospects>DT Prospects</a><a class=dropdown-item href=/lb_prospects>LB Prospects</a><a class=dropdown-item href=/cb_prospects>CB Prospects</a><a class=dropdown-item href=/s_prospects>S Prospects</a><a class=dropdown-item href=/kp_prospects>K/P Prospects</a></div></ul></div></nav><div><table class=\"celled table ui\"id=table width=100%%></table></div>"
private const val INDIVIDUAL_TEAM_HTML = "<!doctypehtml><title>%s</title><link href=https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.1/semantic.min.css rel=stylesheet><link href=https://cdn.datatables.net/1.10.19/css/dataTables.semanticui.min.css rel=stylesheet><link href=https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css rel=stylesheet><script src=https://code.jquery.com/jquery-3.3.1.js></script><script src=https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js></script><script src=https://cdn.datatables.net/1.10.19/js/dataTables.semanticui.min.js></script><script src=https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.1/semantic.min.js></script><script src=https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.bundle.min.js></script><script src=https://cdn.datatables.net/plug-ins/1.10.19/sorting/enum.js></script><script class=init>var dataSet=[%s];$(document).ready(function(){$.fn.dataTable.enum( ['Quarterback','Running Back','Wide Receiver','Tight End','Offensive Line','Defensive End','Defensive Tackle','Linebacker','Cornerback','Safety','Kicker/Punter','Unknown'] );$('#table').DataTable({paging:false,order: [[3, \"desc\"]],data:dataSet,columns:[{ title: 'Draft Year' }, { title: 'Name' }, { title: 'Position' }, { title: 'TPE' }]})});</script><style>div{padding-left:5%%;padding-right:5%%;padding-top:.5%%;padding-bottom:.5%%}caption{padding-top:.75rem;padding-bottom:.75rem;color:rgba(0,0,0,0.87);font-size:28px;text-align:center;caption-side:top}</style><nav class=\"bg-light navbar navbar-expand-lg navbar-light rounded\"><button aria-controls=navbar aria-expanded=false aria-label=\"Toggle navigation\"class=\"collapsed navbar-toggler\"data-target=#navbar data-toggle=collapse type=button><span class=navbar-toggler-icon></span></button><div class=\"collapse navbar-collapse\"id=navbar><ul class=\"mr-auto navbar-nav\"><li class=\"nav-item active\"><a class=nav-link href=/ >Home</a><li class=nav-item><a class=nav-link href=/all_players>All Players</a><li class=nav-item><a class=nav-link href=/team_stats>Team Stats</a><li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\"href=NSFL aria-expanded=false aria-haspopup=true data-toggle=dropdown id=nsfl>NSFL</a><div class=dropdown-menu aria-labelledby=nsfl><a class=dropdown-item href=/baltimore_hawks>Baltimore Hawks</a><a class=dropdown-item href=/colorado_yeti>Colorado Yeti</a><a class=dropdown-item href=/philadelphia_liberty>Philadelphia Liberty</a><a class=dropdown-item href=/yellowknife_wraiths>Yellowknife Wraiths</a><a class=dropdown-item href=/arizona_outlaws>Arizona Outlaws</a><a class=dropdown-item href=/new_orleans_second_line>New Orleans Second Line</a><a class=dropdown-item href=/orange_county_otters>Orange County Otters</a><a class=dropdown-item href=/san_jose_sabercats>San Jose SaberCats</a><a class=dropdown-item href=\"/pasta\">Washington Admirals</a><a class=dropdown-item href=\"/pasta\">Honolulu Islanders</a></div><li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\"href=DSFL aria-expanded=false aria-haspopup=true data-toggle=dropdown id=dsfl>DSFL</a><div class=dropdown-menu aria-labelledby=dsfl><a class=dropdown-item href=/palm_beach_solar_bears>Palm Beach Solar Bears</a><a class=dropdown-item href=/kansas_city_coyotes>Kansas City Coyotes</a><a class=dropdown-item href=/portland_pythons>Portland Pythons</a><a class=dropdown-item href=/norfolk_seawolves>Norfolk SeaWolves</a><a class=dropdown-item href=/san_antonio_marshals>San Antonio Marshals</a><a class=dropdown-item href=/tijuana_luchadores>Tijuana Luchadores</a></div><li class=nav-item><a class=nav-link href=/free_agents>Free Agents</a><li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\"href=Prospects aria-expanded=false aria-haspopup=true data-toggle=dropdown id=prospects>Prospects</a><div class=dropdown-menu aria-labelledby=prospects><a class=dropdown-item href=/qb_prospects>QB Prospects</a><a class=dropdown-item href=/rb_prospects>RB Prospects</a><a class=dropdown-item href=/wr_prospects>WR Prospects</a><a class=dropdown-item href=/te_prospects>TE Prospects</a><a class=dropdown-item href=/ol_prospects>OL Prospects</a><a class=dropdown-item href=/de_prospects>DE Prospects</a><a class=dropdown-item href=/dt_prospects>DT Prospects</a><a class=dropdown-item href=/lb_prospects>LB Prospects</a><a class=dropdown-item href=/cb_prospects>CB Prospects</a><a class=dropdown-item href=/s_prospects>S Prospects</a><a class=dropdown-item href=/kp_prospects>K/P Prospects</a></div></ul></div></nav><div><table class=\"celled table ui\"id=table width=100%%><caption>%s</table></div>"
private const val ERROR_HTML = "<!doctypehtml><title>Whoopsies</title><link href=https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.1/semantic.min.css rel=stylesheet><link href=https://cdn.datatables.net/1.10.19/css/dataTables.semanticui.min.css rel=stylesheet><link href=https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css rel=stylesheet><script src=https://code.jquery.com/jquery-3.3.1.js></script><script src=https://cdn.datatables.net/1.10.19/js/dataTables.semanticui.min.js></script><script src=https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.1/semantic.min.js></script><script src=https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.bundle.min.js></script><style></style><style>div{padding-left:5%%;padding-right:5%%;padding-top:.5%%;padding-bottom:.5%%}caption{padding-top:.75rem;padding-bottom:.75rem;color:rgba(0,0,0,.87);font-size:28px;text-align:center;caption-side:top}.page-wrap{min-height:60vh}</style><nav class=\"bg-light navbar navbar-expand-lg navbar-light rounded\"><button aria-controls=navbar aria-expanded=false aria-label=\"Toggle navigation\"class=\"collapsed navbar-toggler\"data-target=#navbar data-toggle=collapse type=button><span class=navbar-toggler-icon></span></button><div class=\"collapse navbar-collapse\"id=navbar><ul class=\"mr-auto navbar-nav\"><li class=\"nav-item active\"><a class=nav-link href=/ >Home</a><li class=nav-item><a class=nav-link href=/all_players>All Players</a><li class=nav-item><a class=nav-link href=/team_stats>Team Stats</a><li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\"href=NSFL aria-expanded=false aria-haspopup=true data-toggle=dropdown id=nsfl>NSFL</a><div class=dropdown-menu aria-labelledby=nsfl><a class=dropdown-item href=/baltimore_hawks>Baltimore Hawks</a><a class=dropdown-item href=/colorado_yeti>Colorado Yeti</a><a class=dropdown-item href=/philadelphia_liberty>Philadelphia Liberty</a><a class=dropdown-item href=/yellowknife_wraiths>Yellowknife Wraiths</a><a class=dropdown-item href=/arizona_outlaws>Arizona Outlaws</a><a class=dropdown-item href=/new_orleans_second_line>New Orleans Second Line</a><a class=dropdown-item href=/orange_county_otters>Orange County Otters</a><a class=dropdown-item href=/san_jose_sabercats>San Jose SaberCats</a><a class=dropdown-item href=/pasta>Washington Admirals</a><a class=dropdown-item href=/pasta>Honolulu Islanders</a></div><li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\"href=DSFL aria-expanded=false aria-haspopup=true data-toggle=dropdown id=dsfl>DSFL</a><div class=dropdown-menu aria-labelledby=dsfl><a class=dropdown-item href=/palm_beach_solar_bears>Palm Beach Solar Bears</a><a class=dropdown-item href=/kansas_city_coyotes>Kansas City Coyotes</a><a class=dropdown-item href=/portland_pythons>Portland Pythons</a><a class=dropdown-item href=/norfolk_seawolves>Norfolk SeaWolves</a><a class=dropdown-item href=/san_antonio_marshals>San Antonio Marshals</a><a class=dropdown-item href=/tijuana_luchadores>Tijuana Luchadores</a></div><li class=nav-item><a class=nav-link href=/free_agents>Free Agents</a><li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\"href=Prospects aria-expanded=false aria-haspopup=true data-toggle=dropdown id=prospects>Prospects</a><div class=dropdown-menu aria-labelledby=prospects><a class=dropdown-item href=/qb_prospects>QB Prospects</a><a class=dropdown-item href=/rb_prospects>RB Prospects</a><a class=dropdown-item href=/wr_prospects>WR Prospects</a><a class=dropdown-item href=/te_prospects>TE Prospects</a><a class=dropdown-item href=/ol_prospects>OL Prospects</a><a class=dropdown-item href=/de_prospects>DE Prospects</a><a class=dropdown-item href=/dt_prospects>DT Prospects</a><a class=dropdown-item href=/lb_prospects>LB Prospects</a><a class=dropdown-item href=/cb_prospects>CB Prospects</a><a class=dropdown-item href=/s_prospects>S Prospects</a><a class=dropdown-item href=/kp_prospects>K/P Prospects</a></div></ul></div></nav><div><div class=\"align-items-center d-flex flex-row page-wrap\"><div class=container><div class=\"justify-content-center row\"><div class=\"col-md-12 text-center\"><span class=\"mb-4 d-block display-1\">%s</span><span class=\"mb-4 d-block display-10\">%s</span><a class=\"btn btn-link\"href=\"\"onclick=window.location.reload()>Hit me!</a></div></div></div></div></div>"

class HTMLGenerator {

    fun createIndexPage() = INDEX_HTML

    fun createAllPlayersPage(
            playerList: List<Player>
    ) = ALL_PLAYERS_HTML.format(
            "All Players",
            playerList.joinToString(",") {
                "['${it.draftYear}','<a href=\"${it.team.url}\">${it.team.full}</a>','<a href=\"/player?playerId=${it.id}\">${it.name}</a>','${it.position.full}','${it.tpe}']"
            }
    )

    fun createPlayerPage(
            player: Player,
            playerTPEHistory: List<Pair<String, Int>>
    ) = INDIVIDUAL_PLAYER_HTML.format(
            player.name,
            "http://nsfl.jcink.net/index.php?showtopic=${player.id}",
            player.name,
            player.team.url,
            player.team.full,
            "${player.position.full} - ${player.draftYear}",
            playerTPEHistory.joinToString(",") {
                "'${it.first}'"
            },
            playerTPEHistory.joinToString(",") {
                "'${it.second}'"
            }
    )

    fun createTeamStatsPage(
            nsflList: List<Pair<Team, List<Player>>>,
            dsflList: List<Pair<Team, List<Player>>>
    ) = TEAM_STATS_HTML.format(
            "Team Stats",
            nsflList.joinToString(",") { pair ->
                val totalTPE = pair.second.sumBy { it.tpe }
                "['NSFL','<a href=\"${pair.first.url}\">${pair.first.full}</a>','$totalTPE','$totalTPE','${totalTPE / pair.second.size}']"
            } + "," + dsflList.joinToString(",") { pair ->
                val totalTPE = pair.second.sumBy { it.tpe }
                val totalEffectiveTPE = pair.second.sumBy { if (it.tpe > 250) 250 else it.tpe }
                "['DSFL','<a href=\"${pair.first.url}\">${pair.first.full}</a>','$totalTPE','$totalEffectiveTPE','${totalTPE / pair.second.size}']"
            }
    )

    fun createTeamPage(
            team: Team,
            playerList: List<Player>
    ) = INDIVIDUAL_TEAM_HTML.format(
            team.full,
            playerList.joinToString(",") {
                "['${it.draftYear}','<a href=\"/player?playerId=${it.id}\">${it.name}</a>','${it.position.full}','${it.tpe}']"
            },
            team.full
    )

    fun createErrorPage(error: String, copyPasta: String) = ERROR_HTML.format(error, copyPasta)
}