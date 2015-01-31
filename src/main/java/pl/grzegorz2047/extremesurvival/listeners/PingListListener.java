/*
 * Copyright 2015 Grzegorz.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.grzegorz2047.extremesurvival.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import pl.grzegorz2047.extremesurvival.Main;

/**
 *
 * @author Grzegorz
 */
public class PingListListener implements Listener {
    
    @EventHandler
    void onPing(ServerListPingEvent e){
        if(Main.getES().getBorder().isRunning()){
            e.setMotd(ChatColor.BOLD+" "+ChatColor.GREEN+"Na serwerze trwa czystka! Trzeba czekac!");
        }else{
            e.setMotd(ChatColor.BOLD+" "+ChatColor.GREEN+"Zapraszamy na serwer Purge!");
        }
        
    }
    
}