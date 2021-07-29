package com.enuaruke.mhs2.controller;

import com.enuaruke.mhs2.common.ModelAndView;
import com.enuaruke.mhs2.pojo.Weakness;
import com.enuaruke.mhs2.service.GeneService;
import com.enuaruke.mhs2.service.MonsterService;
import com.enuaruke.mhs2.service.WeaknessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Aruke
 * @date 2021/7/22 9:28
 * @info
 */
@RestController
@RequestMapping("mhs2Service")
public class Mhs2Controller {

    @Autowired
    private WeaknessService weaknessService;

    @Autowired
    private MonsterService monsterService;

    @Autowired
    private GeneService geneService;

    @RequestMapping("selectWeakness")
    public ModelAndView selectWeakness(String name){
        ModelAndView mav = new ModelAndView();
        mav.setData(weaknessService.select(name));
        return mav;
    }

    @RequestMapping("selectMonster")
    public ModelAndView selectMonster(String name, String materialName){
        ModelAndView mav = new ModelAndView();
        mav.setData(monsterService.selectByTerm(name, materialName));
        return mav;
    }

    @RequestMapping("selectGene")
    public ModelAndView selectGene(String geneName, String skillClass, String skillProperty, String name){
        ModelAndView mav = new ModelAndView();
        mav.setData(geneService.selectGene(geneName, skillClass, skillProperty, name));
        return mav;
    }

    @RequestMapping("selectWeaknessList")
    public ModelAndView selectWeaknessList(@RequestBody List<Integer> ids){
        ModelAndView mav = new ModelAndView();
        mav.setData(weaknessService.selectByIds(ids));
        return mav;
    }

    @RequestMapping("selectZone")
    public ModelAndView selectZone(){
        ModelAndView mav = new ModelAndView();
        mav.setData(monsterService.selectZone());
        return mav;
    }

    @RequestMapping("selectZoneMonster")
    public ModelAndView selectZoneMonsters(Integer zoneId){
        ModelAndView mav = new ModelAndView();
        mav.setData(weaknessService.selectByZoneId(zoneId));
        return mav;
    }

}
