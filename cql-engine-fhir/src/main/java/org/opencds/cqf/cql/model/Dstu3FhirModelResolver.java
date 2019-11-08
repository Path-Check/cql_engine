package org.opencds.cqf.cql.model;

import org.hl7.fhir.dstu3.model.Base;
import org.hl7.fhir.dstu3.model.EnumFactory;
import org.opencds.cqf.cql.exception.UnknownType;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.FhirVersionEnum;

public class Dstu3FhirModelResolver extends FhirModelResolver<Base> {

	public Dstu3FhirModelResolver() {
        this(FhirContext.forDstu3());
	}

	public Dstu3FhirModelResolver(FhirContext fhirContext) {
        super(fhirContext, (x, y) -> x.equalsDeep(y));
        this.setPackageName("org.hl7.fhir.dstu3.model");
    
        if (fhirContext.getVersion().getVersion() != FhirVersionEnum.DSTU3) {
            throw new IllegalArgumentException("The supplied context is not configured for DSTU3");
        }
	}

	@Override
    public Object createInstance(String typeName) {
        String className = resolveClassName(typeName);
        if (className.indexOf('$') >= 0) {
            className += "EnumFactory";

            return new org.hl7.fhir.dstu3.model.Enumeration((EnumFactory)createInstance(resolveClass(className)));
        }

        return createInstance(resolveClass(className));
    }

	@Override
    public Class resolveType(Object value) {
        if (value instanceof org.hl7.fhir.dstu3.model.Enumeration) {
            String className = ((org.hl7.fhir.dstu3.model.Enumeration)value).getEnumFactory().getClass().getName();
            try {
                className = className.substring(0, className.indexOf("EnumFactory"));
                return Class.forName(className);
            } catch (ClassNotFoundException e) {
                throw new UnknownType(String.format("Could not resolve type %s", className));
            }
        }

        return super.resolveType(value);
	}

	@Override
	public String resolveClassName(String typeName) {
        // TODO: Use the bindingName extension on the StructureDefinition for this
        switch (typeName) {
            case "base64Binary": typeName = "Base64BinaryType"; break;
            case "boolean": typeName = "BooleanType"; break;
            case "dateTime": typeName = "DateTimeType"; break;
            case "date": typeName = "DateType"; break;
            case "decimal": typeName = "DecimalType"; break;
            case "instant": typeName = "InstantType"; break;
            case "integer": typeName = "IntegerType"; break;
            case "positiveInt": typeName = "PositiveIntType"; break;
            case "unsignedInt": typeName = "UnsignedIntType"; break;
            case "string": typeName = "StringType"; break;
            case "code": typeName = "CodeType"; break;
            case "markdown": typeName = "MarkdownType"; break;
            case "time": typeName = "TimeType"; break;
            case "uri": typeName = "UriType"; break;
            case "uuid": typeName = "UuidType"; break;
            case "id": typeName = "IdType"; break;
            case "oid": typeName = "OidType"; break;
            case "TestScriptRequestMethodCode": typeName = "TestScript$TestScriptRequestMethodCode"; break;
            case "ActionPrecheckBehavior": typeName = "PlanDefinition$ActionPrecheckBehavior"; break;
            case "PlanActionPrecheckBehavior": typeName = "PlanDefinition$ActionPrecheckBehavior"; break;
            case "ProvenanceEntityRole": typeName = "Provenance$ProvenanceEntityRole"; break;
            case "UnitsOfTime": typeName = "Timing$UnitsOfTime"; break;
            case "AddressType": typeName = "Address$AddressType"; break;
            case "AllergyIntoleranceCategory": typeName = "AllergyIntolerance$AllergyIntoleranceCategory"; break;
            case "SpecimenStatus": typeName = "Specimen$SpecimenStatus"; break;
            case "RestfulCapabilityMode": typeName = "CapabilityStatement$RestfulCapabilityMode"; break;
            case "DetectedIssueSeverity": typeName = "DetectedIssue$DetectedIssueSeverity"; break;
            case "IssueSeverity": typeName = "OperationOutcome$IssueSeverity"; break;
            case "CareTeamStatus": typeName = "CareTeam$CareTeamStatus"; break;
            case "DataElementStringency": typeName = "DataElement$DataElementStringency"; break;
            case "VisionEyes": typeName = "VisionPrescription$VisionEyes"; break;
            case "VisionBase": typeName = "VisionPrescription$VisionBase"; break;
            case "StructureMapSourceListMode": typeName = "StructureMap$StructureMapSourceListMode"; break;
            case "RequestStatus": typeName="RequestGroup$RequestStatus"; break;
            case "RequestIntent": typeName="RequestGroup$RequestIntent"; break;
            case "RequestPriority": typeName="RequestGroup$RequestPriority"; break;
            case "ActionConditionKind": typeName = "PlanDefinition$ActionConditionKind"; break;
            case "EncounterStatus": typeName = "Encounter$EncounterStatus"; break;
            case "ChargeItemStatus": typeName = "ChargeItem$ChargeItemStatus"; break;
            case "ActionParticipantType": typeName = "PlanDefinition$ActionParticipantType"; break;
            case "StructureDefinitionKind": typeName = "StructureDefinition$StructureDefinitionKind"; break;
            case "PublicationStatus": typeName = "Enumerations$PublicationStatus"; break;
            case "TestReportResult": typeName = "TestReport$TestReportResult"; break;
            case "ConceptMapGroupUnmappedMode": typeName = "ConceptMap$ConceptMapGroupUnmappedMode"; break;
            case "ConsentDataMeaning": typeName = "Consent$ConsentDataMeaning"; break;
            case "QuestionnaireResponseStatus": typeName = "QuestionnaireResponse$QuestionnaireResponseStatus"; break;
            case "SearchComparator": typeName = "SearchParameter$SearchComparator"; break;
            case "AllergyIntoleranceType": typeName = "AllergyIntolerance$AllergyIntoleranceType"; break;
            case "DocumentRelationshipType": typeName = "DocumentReference$DocumentRelationshipType"; break;
            case "AllergyIntoleranceClinicalStatus": typeName = "AllergyIntolerance$AllergyIntoleranceClinicalStatus"; break;
            case "CarePlanActivityStatus": typeName = "CarePlan$CarePlanActivityStatus"; break;
            case "ActionList": typeName = "ProcessRequest$ActionList"; break;
            case "ParticipationStatus": typeName = "Appointment$ParticipationStatus"; break;
            case "ActionSelectionBehavior": typeName = "PlanDefinition$ActionSelectionBehavior"; break;
            case "DocumentMode": typeName = "CapabilityStatement$DocumentMode"; break;
            case "AssertionOperatorType": typeName = "TestScript$AssertionOperatorType"; break;
            case "DaysOfWeek": typeName = "HealthcareService$DaysOfWeek"; break;
            case "IssueType": typeName = "OperationOutcome$IssueType"; break;
            case "ContentType": typeName = "TestScript$ContentType"; break;
            case "StructureMapContextType": typeName = "StructureMap$StructureMapContextType"; break;
            case "FamilyHistoryStatus": typeName = "FamilyMemberHistory$FamilyHistoryStatus"; break;
            case "MedicationStatementCategory": typeName = "MedicationStatement$MedicationStatementCategory"; break;
            case "CommunicationStatus": typeName = "Communication$CommunicationStatus"; break;
            case "ClinicalImpressionStatus": typeName = "ClinicalImpression$ClinicalImpressionStatus"; break;
            case "AssertionResponseTypes": typeName = "TestScript$AssertionResponseTypes"; break;
            case "NarrativeStatus": typeName = "Narrative$NarrativeStatus"; break;
            case "ReferralCategory": typeName = "ReferralRequest$ReferralCategory"; break;
            case "MeasmntPrinciple": typeName = "DeviceComponent$MeasmntPrinciple"; break;
            case "ConsentExceptType": typeName = "Consent$ConsentExceptType"; break;
            case "EndpointStatus": typeName = "Endpoint$EndpointStatus"; break;
            case "GuidePageKind": typeName = "ImplementationGuide$GuidePageKind"; break;
            case "GuideDependencyType": typeName = "ImplementationGuide$GuideDependencyType"; break;
            case "ResourceVersionPolicy": typeName = "CapabilityStatement$ResourceVersionPolicy"; break;
            case "MedicationRequestStatus": typeName = "MedicationRequest$MedicationRequestStatus"; break;
            case "MedicationRequestIntent": typeName = "MedicationRequest$MedicationRequestIntent"; break;
            case "MedicationRequestPriority": typeName = "MedicationRequest$MedicationRequestPriority"; break;
            case "MedicationAdministrationStatus": typeName = "MedicationAdministration$MedicationAdministrationStatus"; break;
            case "NamingSystemIdentifierType": typeName = "NamingSystem$NamingSystemIdentifierType"; break;
            case "AccountStatus": typeName = "Account$AccountStatus"; break;
            case "ProcedureRequestPriority": typeName = "ProcedureRequest$ProcedureRequestPriority"; break;
            case "MedicationDispenseStatus": typeName = "MedicationDispense$MedicationDispenseStatus"; break;
            case "IdentifierUse": typeName = "Identifier$IdentifierUse"; break;
            case "DigitalMediaType": typeName = "Media$DigitalMediaType"; break;
            case "TestReportParticipantType": typeName = "TestReport$TestReportParticipantType"; break;
            case "BindingStrength": typeName = "Enumerations$BindingStrength"; break;
            case "ConsentState": typeName = "Consent$ConsentState"; break;
            case "ParticipantRequired": typeName = "Appointment$ParticipantRequired"; break;
            case "DiscriminatorType": typeName = "ElementDefinition$DiscriminatorType"; break;
            case "XPathUsageType": typeName = "SearchParameter$XPathUsageType"; break;
            case "StructureMapInputMode": typeName = "StructureMap$StructureMapInputMode"; break;
            case "InstanceAvailability": typeName = "ImagingStudy$InstanceAvailability"; break;
            case "ImmunizationStatusCodes": typeName = "Immunization$ImmunizationStatus"; break;
            case "ConfidentialityClassification": typeName = "Composition$DocumentConfidentiality"; break;
            case "LinkageType": typeName = "Linkage$LinkageType"; break;
            case "ReferenceHandlingPolicy": typeName = "CapabilityStatement$ReferenceHandlingPolicy"; break;
            case "FilterOperator": typeName = "CodeSystem$FilterOperator"; break;
            case "NamingSystemType": typeName = "NamingSystem$NamingSystemType"; break;
            case "ResearchStudyStatus": typeName = "ResearchStudy$ResearchStudyStatus"; break;
            case "ExtensionContext": typeName = "StructureDefinition$ExtensionContext"; break;
            case "AuditEventOutcome": typeName = "AuditEvent$AuditEventOutcome"; break;
            case "ConstraintSeverity": typeName = "ElementDefinition$ConstraintSeverity"; break;
            case "EventCapabilityMode": typeName = "CapabilityStatement$EventCapabilityMode"; break;
            case "ProcedureStatus": typeName = "Procedure$ProcedureStatus"; break;
            case "ResearchSubjectStatus": typeName = "ResearchSubject$ResearchSubjectStatus"; break;
            case "ActionGroupingBehavior": typeName = "PlanDefinition$ActionGroupingBehavior"; break;
            case "CompositeMeasureScoring": typeName = "Measure$CompositeMeasureScoring"; break;
            case "DeviceMetricCategory": typeName = "DeviceMetric$DeviceMetricCategory"; break;
            case "QuestionnaireStatus": typeName = "Questionnaire$QuestionnaireStatus"; break;
            case "StructureMapTransform": typeName = "StructureMap$StructureMapTransform"; break;
            case "StructureMapTargetListMode": typeName = "StructureMap$StructureMapTargetListMode"; break;
            case "ResponseType": typeName = "MessageHeader$ResponseType"; break;
            case "AggregationMode": typeName = "ElementDefinition$AggregationMode"; break;
            case "CapabilityStatementKind": typeName = "CapabilityStatement$CapabilityStatementKind"; break;
            case "sequenceType": typeName = "Sequence$SequenceType"; break;
            case "AllergyIntoleranceVerificationStatus": typeName = "AllergyIntolerance$AllergyIntoleranceVerificationStatus"; break;
            case "EventTiming": typeName = "Timing$EventTiming"; break;
            case "GoalStatus": typeName = "Goal$GoalStatus"; break;
            case "SearchParamType": typeName = "Enumerations$SearchParamType"; break;
            case "SystemRestfulInteraction": typeName = "CapabilityStatement$SystemRestfulInteraction"; break;
            case "StructureMapModelMode": typeName = "StructureMap$StructureMapModelMode"; break;
            case "TaskStatus": typeName = "Task$TaskStatus"; break;
            case "AdverseEventCausality": typeName = "AdverseEvent$AdverseEventCausality"; break;
            case "AdverseEventCategory": typeName = "AdverseEvent$AdverseEventCategory"; break;
            case "MeasurePopulationType": typeName = "Measure$MeasurePopulationType"; break;
            case "SubscriptionChannelType": typeName = "Subscription$SubscriptionChannelType"; break;
            case "GraphCompartmentRule": typeName = "GraphDefinition$GraphCompartmentRule"; break;
            case "ProcedureRequestStatus": typeName = "ProcedureRequest$ProcedureRequestStatus"; break;
            case "ReferralStatus": typeName = "ReferralRequest$ReferralStatus"; break;
            case "AssertionDirectionType": typeName = "TestScript$AssertionDirectionType"; break;
            case "SlicingRules": typeName = "ElementDefinition$SlicingRules"; break;
            case "ExplanationOfBenefitStatus": typeName = "ExplanationOfBenefit$ExplanationOfBenefitStatus"; break;
            case "LinkType": typeName = "Patient$LinkType"; break;
            case "AllergyIntoleranceCriticality": typeName = "AllergyIntolerance$AllergyIntoleranceCriticality"; break;
            case "ConceptMapEquivalence": typeName = "Enumerations$ConceptMapEquivalence"; break;
            case "PropertyRepresentation": typeName = "ElementDefinition$PropertyRepresentation"; break;
            case "AuditEventAction": typeName = "AuditEvent$AuditEventAction"; break;
            case "MeasureDataUsage": typeName = "Measure$MeasureDataUsage"; break;
            case "TriggerType": typeName = "TriggerDefinition$TriggerType"; break;
            case "ActivityDefinitionCategory": typeName = "ActivityDefinition$ActivityDefinitionCategory"; break;
            case "SearchModifierCode": typeName = "SearchParameter$SearchModifierCode"; break;
            case "CompositionStatus": typeName = "Composition$CompositionStatus"; break;
            case "AppointmentStatus": typeName = "Appointment$AppointmentStatus"; break;
            case "MessageSignificanceCategory": typeName = "CapabilityStatement$MessageSignificanceCategory"; break;
            case "EventStatus": typeName = "Procedure$ProcedureStatus"; break;
            case "OperationParameterUse": typeName = "OperationDefinition$OperationParameterUse"; break;
            case "ListMode": typeName = "ListResource$ListMode"; break;
            case "ObservationStatus": typeName = "Observation$ObservationStatus"; break;
            case "qualityType": typeName = "Sequence$QualityType"; break;
            case "AdministrativeGender": typeName = "Enumerations$AdministrativeGender"; break;
            case "MeasureType": typeName = "Measure$MeasureType"; break;
            case "QuestionnaireItemType": typeName = "Questionnaire$QuestionnaireItemType"; break;
            case "StructureMapListMode": typeName = "StructureMap$StructureMapListMode"; break;
            case "StructureMapGroupTypeMode": typeName = "StructureMap$StructureMapGroupTypeMode"; break;
            case "DeviceMetricCalibrationType": typeName = "DeviceMetric$DeviceMetricCalibrationType"; break;
            case "SupplyRequestStatus": typeName = "SupplyRequest$SupplyRequestStatus"; break;
            case "EncounterLocationStatus": typeName = "Encounter$EncounterLocationStatus"; break;
            case "SupplyDeliveryStatus": typeName = "SupplyDelivery$SupplyDeliveryStatus"; break;
            case "DiagnosticReportStatus": typeName = "DiagnosticReport$DiagnosticReportStatus"; break;
            case "FlagStatus": typeName = "Flag$FlagStatus"; break;
            case "AllergyIntoleranceCertainty": typeName = "AllergyIntolerance$AllergyIntoleranceCertainty"; break;
            case "CarePlanStatus": typeName = "CarePlan$CarePlanStatus"; break;
            case "CarePlanIntent": typeName = "CarePlan$CarePlanIntent"; break;
            case "ConditionClinicalStatusCodes": typeName = "Condition$ConditionClinicalStatus"; break;
            case "ListStatus": typeName = "ListResource$ListStatus"; break;
            case "DeviceUseStatementStatus": typeName = "DeviceUseStatement$DeviceUseStatementStatus"; break;
            case "MeasureScoring": typeName = "Measure$MeasureScoring"; break;
            case "AuditEventAgentNetworkType": typeName = "AuditEvent$AuditEventAgentNetworkType"; break;
            case "AddressUse": typeName = "Address$AddressUse"; break;
            case "ConditionalDeleteStatus": typeName = "CapabilityStatement$ConditionalDeleteStatus"; break;
            case "ContactPointUse": typeName = "ContactPoint$ContactPointUse"; break;
            case "UDIEntryType": typeName = "Device$UDIEntryType"; break;
            case "DeviceMetricOperationalStatus": typeName = "DeviceMetric$DeviceMetricOperationalStatus"; break;
            case "NutritionOrderStatus": typeName = "NutritionOrder$NutritionOrderStatus"; break;
            case "ContributorType": typeName = "Contributor$ContributorType"; break;
            case "ReferenceVersionRules": typeName = "ElementDefinition$ReferenceVersionRules"; break;
            case "Use": typeName = "Claim$Use"; break;
            case "IdentityAssuranceLevel": typeName = "Person$IdentityAssuranceLevel"; break;
            case "MeasureReportStatus": typeName = "MeasureReport$MeasureReportStatus"; break;
            case "DeviceMetricColor": typeName = "DeviceMetric$DeviceMetricColor"; break;
            case "SearchEntryMode": typeName = "Bundle$SearchEntryMode"; break;
            case "ConditionalReadStatus": typeName = "CapabilityStatement$ConditionalReadStatus"; break;
            case "ConditionVerificationStatus": typeName = "Condition$ConditionVerificationStatus"; break;
            case "AllergyIntoleranceSeverity": typeName = "AllergyIntolerance$AllergyIntoleranceSeverity"; break;
            case "FinancialResourceStatusCodes": typeName = "ClaimResponse$ClaimResponseStatus"; break;
            case "OperationKind": typeName = "OperationDefinition$OperationKind"; break;
            case "ObservationRelationshipType": typeName = "Observation$ObservationRelationshipType"; break;
            case "NameUse": typeName = "HumanName$NameUse"; break;
            case "SubscriptionStatus": typeName = "Subscription$SubscriptionStatus"; break;
            case "DocumentReferenceStatus": typeName = "Enumerations$DocumentReferenceStatus"; break;
            case "CommunicationRequestStatus": typeName = "CommunicationRequest$CommunicationRequestStatus"; break;
            case "LocationMode": typeName = "Location$LocationMode"; break;
            case "repositoryType": typeName = "Sequence$RepositoryType"; break;
            case "CarePlanRelationship": typeName = "CarePlan$CarePlanRelationship"; break;
            case "LocationStatus": typeName = "Location$LocationStatus"; break;
            case "FHIRSubstanceStatus": typeName = "Substance$FHIRSubstanceStatus"; break;
            case "UnknownContentCode": typeName = "CapabilityStatement$UnknownContentCode"; break;
            case "NoteType": typeName = "Enumerations$NoteType"; break;
            case "TestReportStatus": typeName = "TestReport$TestReportStatus"; break;
            case "TestReportActionResult": typeName = "TestReport$TestReportActionResult"; break;
            case "HTTPVerb": typeName = "Bundle$HTTPVerb"; break;
            case "CodeSystemContentMode": typeName = "CodeSystem$CodeSystemContentMode"; break;
            case "ActionRelationshipType": typeName = "PlanDefinition$ActionRelationshipType"; break;
            case "EpisodeOfCareStatus": typeName = "EpisodeOfCare$EpisodeOfCareStatus"; break;
            case "RemittanceOutcome": typeName = "Enumerations$RemittanceOutcome"; break;
            case "FHIRDeviceStatus": typeName = "Device$FHIRDeviceStatus"; break;
            case "ContactPointSystem": typeName = "ContactPoint$ContactPointSystem"; break;
            case "SlotStatus": typeName = "Slot$SlotStatus"; break;
            case "PropertyType": typeName = "CodeSystem$PropertyType"; break;
            case "TypeDerivationRule": typeName = "StructureDefinition$TypeDerivationRule"; break;
            case "MedicationStatus": typeName = "Medication$MedicationStatus"; break;
            case "MedicationStatementStatus": typeName = "MedicationStatement$MedicationStatementStatus"; break;
            case "GuidanceResponseStatus": typeName = "GuidanceResponse$GuidanceResponseStatus"; break;
            case "QuantityComparator": typeName = "Quantity$QuantityComparator"; break;
            case "RelatedArtifactType": typeName = "RelatedArtifact$RelatedArtifactType"; break;
            case "DeviceStatus": typeName = "Device$DeviceStatus"; break;
            case "ContractResourceStatusCodes": typeName = "Contract$ContractStatus"; break;
            case "TestReportResultCodes": typeName = "TestReport$TestReportResult"; break;
            case "MeasureReportType": typeName = "MeasureReport$MeasureReportType"; break;
            case "SampledDataDataType": typeName = "StringType"; break;
            case "MedicationStatementTaken": typeName = "MedicationStatement$MedicationStatementTaken"; break;
            case "CompartmentType": typeName = "CompartmentDefinition$CompartmentType"; break;
            case "CompositionAttestationMode": typeName = "Composition$CompositionAttestationMode"; break;
            case "ActionRequiredBehavior": typeName = "PlanDefinition$ActionRequiredBehavior"; break;
            case "DeviceMetricCalibrationState": typeName = "DeviceMetric$DeviceMetricCalibrationState"; break;
            case "GroupType": typeName = "Group$GroupType"; break;
            case "TypeRestfulInteraction": typeName = "CapabilityStatement$TypeRestfulInteraction"; break;
            case "ActionCardinalityBehavior": typeName = "PlanDefinition$ActionCardinalityBehavior"; break;
            case "CodeSystemHierarchyMeaning": typeName = "CodeSystem$CodeSystemHierarchyMeaning"; break;
            case "MedicationStatementNotTaken": typeName = "MedicationStatement$MedicationStatementNotTaken"; break;
            case "BundleType": typeName = "Bundle$BundleType"; break;
            case "SystemVersionProcessingMode": typeName = "ExpansionProfile$SystemVersionProcessingMode"; break;
            case "FHIRDefinedType": typeName = "Enumerations$FHIRDefinedType"; break;
            case "FHIRAllTypes": typeName = "Enumerations$FHIRAllTypes"; break;
        }

        return typeName;
	}

	@Override
	public Object getContextPath(String contextType, String targetType) {
		switch (contextType) {
			case "Patient":
				switch (targetType) {
					case "Account":
						return "subject";
					case "AdverseEvent":
						return "subject";
					case "AllergyIntolerance":
						return "patient";
					case "Appointment":
						return "actor";
					case "AppointmentResponse":
						return "actor";
					case "AuditEvent":
						return "patient";
					case "Basic":
						return "patient";
					case "BodySite":
						return "patient";
					case "CarePlan":
						return "patient";
					case "CareTeam":
						return "patient";
					case "ChargeItem":
						return "subject";
					case "Claim":
						return "patient";
					case "ClaimResponse":
						return "patient";
					case "ClinicalImpression":
						return "subject";
					case "Communication":
						return "subject";
					case "CommunicationRequest":
						return "subject";
					case "Composition":
						return "subject";
					case "Condition":
						return "patient";
					case "Consent":
						return "patient";
					case "Coverage":
						return "patient";
					case "DetectedIssue":
						return "patient";
					case "DeviceRequest":
						return "subject";
					case "DeviceUseStatement":
						return "subject";
					case "DiagnosticReport":
						return "subject";
					case "DocumentManifest":
						return "subject";
					case "DocumentReference":
						return "subject";
					case "EligibilityRequest":
						return "patient";
					case "Encounter":
						return "patient";
					case "EnrollmentRequest":
						return "subject";
					case "EpisodeOfCare":
						return "patient";
					case "ExplanationOfBenefit":
						return "patient";
					case "FamilyMemberHistory":
						return "patient";
					case "Flag":
						return "patient";
					case "Goal":
						return "patient";
					case "Group":
						return "member";
					case "ImagingManifest":
						return "patient";
					case "ImagingStudy":
						return "patient";
					case "Immunization":
						return "patient";
					case "ImmunizationRecommendation":
						return "patient";
					case "List":
						return "subject";
					case "MeasureReport":
						return "patient";
					case "Media":
						return "subject";
					case "MedicationAdministration":
						return "patient";
					case "MedicationDispense":
						return "patient";
					case "MedicationRequest":
						return "subject";
					case "MedicationStatement":
						return "subject";
					case "NutritionOrder":
						return "patient";
					case "Observation":
						return "subject";
					case "Patient":
						return "_id";
					case "Person":
						return "patient";
					case "Procedure":
						return "patient";
					case "ProcedureRequest":
						return "patient";
					case "Provenance":
						return "patient";
					case "QuestionnaireResponse":
						return "subject";
					case "ReferralRequest":
						return "patient";
					case "RelatedPerson":
						return "patient";
					case "RequestGroup":
						return "subject";
					case "ResearchSubject":
						return "individual";
					case "RiskAssessment":
						return "subject";
					case "Schedule":
						return "actor";
					case "Specimen":
						return "subject";
					case "SupplyDelivery":
						return "patient";
					case "SupplyRequest":
						return "subject";
					case "VisionPrescription":
						return "patient";
				}
				break;
		
			default:
				break;
		}

        return null;
	}
}