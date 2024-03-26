package ru.real.backend.api.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApartmentParserDto {
    private Long externalId;
    private String externalUuid;
    private Integer apartmentNumber;
    private String postalNumber;
    private String generalLotNumber;
    private Integer quantityRooms;
    private Boolean isEuro;
    private Integer entrance;
    private Integer section;
    private Integer floor;
    private String riserNumber;
    private String riserCardinalDirections;
    private String planningGroup;
    private String planningCode;
    private String apartmentClass;
    private Double square;
    private Double squareFull;
    private Double price;
    private Double previousPrice;
    private Double legalPrice;
    private Double squarePrice;
    private Double specialOfferPrice;
    private Double arbitraryPrice;
    private Double arbitraryPrice2;
    private Double arbitraryPrice3;
    private Double collateralPrice;
    private Double estimatedPrice;
    private String status;
    private Boolean isHotOffer;
    private String tags;
    private String objectCode;
    private Boolean isApartments;
    private Boolean isPenthouse;
    private Long sellerId;
    private String planningCodeDDY;
    private Double squareBTI;
    private Double squareCoefficientBTI;
    private Double squareBTIWithoutLP;
    private Double residentialSquareBTI;
    private Double squareLoggiaBTI;
    private Double squareBalconyBTI;
    private Double squareDDY;
    private Double squareWithoutLP;
    private Double squareReduced;
    private Double squareProject;
    private Double squareArbitrary;
    private Double squareArbitrary2;
    private Double squareArbitrary3;
    private Double residentialSquare;
    private Double squareRoom;
    private Double squareRoom2;
    private Double squareRoom3;
    private Double squareRoom4;
    private Double squareKitchen;
    private Double squareKitchenLivingRoom;
    private Double squareLivingRoom;
    private Double squareBedroomRoom;
    private Double squareBedroomRoom2;
    private Double squareBedroomRoom3;
    private Double squareBedroomRoom4;
    private Double squareWardrobe;
    private Double squareWardrobe2;
    private Double squareWardrobe3;
    private Double squareHallway;
    private String bathroom;
    private Double squareBathroom;
    private Double squareBathroom2;
    private Double squareBathroom3;
    private Double squareLoggia;
    private Double squareLoggiaArbitrary;
    private Double squareLoggia2;
    private Double squareLoggiaArbitrary2;
    private Double squareLoggia3;
    private Double squareLoggiaArbitrary3;
    private Double squareBalcony;
    private Double squareBalconyArbitrary;
    private Double squareBalcony2;
    private Double squareBalconyArbitrary2;
    private Double balconyFenceHeight;
    private Double balconyHeight;
    private Double squareTerrace;
    private Double squareTerraceArbitrary;
    private Double squareTerrace2;
    private Double squareTerraceArbitrary2;
    private Double squarePantry;
    private Double squareAuxiliaryPremises;
    private Integer auxiliaryPremisesCount;
    private Boolean isRepair;
    private String repairType;
    private String repairQuality;
    private String windowsView;
    private String constructionAxes;
    private Double ceilingHeight;
    private String cadastralNumber;
    private Double agreementBasedAmount;
    private Double agreementBasedSquare;
    private String preInstalledAgreementNumber;
    private String preInstalledAgreementBasedNumber;
    private LocalDate preInstalledAgreementBasedDate;
    private String preInstalledAgreementBasedContact;
    private LocalDate preInstalledAgreementBasedRegistrationDate;
    private String preInstalledAgreementBasedRegistrationNumber;
    private String agreementBasedScheduledPaymentSchedule;
    private String agreementScheduledPaymentSchedule;
    private String agreementBasedDepositedAmount;
    private String providingMethod;
    private LocalDate reservationEndDate;
    private String serviceMarks;
    private String customText;
    private String customText2;
    private String customText3;
    private Boolean isExclusive;
    private Integer levelsCount;
    private String roomsType;
    private String saleType;
    private String virtualTourLink;
    private Double agentFees;
    private String sellingName;
    private LocalDate readyForTransferObjectPlannedDate;
    private LocalDate readyForTransferObjectActualDate;
    private String address;
    private String planningName;
    private String planningDescription;
    private Boolean smartPlanning;
    private ZonedDateTime dateTimeCreated;
}
