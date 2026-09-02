package com.smartagri.model; 
import java.util.List; 
public class Models { 
public record Scheme(String id,String name,String category,String eligibility,String benefits,String documents,String howToApply,String note){} 
public record Animal(String id,String name,String uses,List<String> feeds,List<String> warningSigns,List<String> prevention,String medicineNote){} 
public record Plant(String id,String name,String soil,String season,String planting,String irrigation,List<String> diseaseSigns,String harvest,String uses){} 
public record Seed(String id,String name,String crop,String variety,String soil,String sowingMonths,String harvestMonths,String sowingMethod,String spacing,String water,String uses){} 
public record WasteSolution(String id,String wasteType,List<String> usefulProducts,String process,String safetyNote){} 
public record EnergyOption(String id,String name,String source,String uses,String suitableFor,String benefit){} 
public record AnalysisRequest(String soilType,String farmType,String season,String waterAvailability){} 
public record AnalysisResponse(String soilType,String farmType,List<String> recommendations,String advice){} 
}
