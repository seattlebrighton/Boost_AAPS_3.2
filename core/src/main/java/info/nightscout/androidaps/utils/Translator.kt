package info.nightscout.androidaps.utils

import info.nightscout.androidaps.core.R
import info.nightscout.androidaps.database.entities.TemporaryTarget
import info.nightscout.androidaps.database.entities.TherapyEvent
import info.nightscout.androidaps.database.entities.UserEntry.*
import info.nightscout.androidaps.utils.resources.ResourceHelper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Translator @Inject internal constructor(
    private val resourceHelper: ResourceHelper
) {

    @Deprecated("use type instead of string")
    fun translate(text: String): String =
        when (text) {
            TherapyEvent.Type.FINGER_STICK_BG_VALUE.text   -> resourceHelper.gs(R.string.careportal_bgcheck)
            TherapyEvent.Type.SNACK_BOLUS.text             -> resourceHelper.gs(R.string.careportal_snackbolus)
            TherapyEvent.Type.MEAL_BOLUS.text              -> resourceHelper.gs(R.string.careportal_mealbolus)
            TherapyEvent.Type.CORRECTION_BOLUS.text        -> resourceHelper.gs(R.string.careportal_correctionbolus)
            TherapyEvent.Type.CARBS_CORRECTION.text        -> resourceHelper.gs(R.string.careportal_carbscorrection)
            TherapyEvent.Type.BOLUS_WIZARD.text            -> resourceHelper.gs(R.string.boluswizard)
            TherapyEvent.Type.COMBO_BOLUS.text             -> resourceHelper.gs(R.string.careportal_combobolus)
            TherapyEvent.Type.ANNOUNCEMENT.text            -> resourceHelper.gs(R.string.careportal_announcement)
            TherapyEvent.Type.NOTE.text                    -> resourceHelper.gs(R.string.careportal_note)
            TherapyEvent.Type.QUESTION.text                -> resourceHelper.gs(R.string.careportal_question)
            TherapyEvent.Type.EXERCISE.text                -> resourceHelper.gs(R.string.careportal_exercise)
            TherapyEvent.Type.CANNULA_CHANGE.text          -> resourceHelper.gs(R.string.careportal_pumpsitechange)
            TherapyEvent.Type.PUMP_BATTERY_CHANGE.text     -> resourceHelper.gs(R.string.careportal_pumpbatterychange)
            TherapyEvent.Type.SENSOR_STARTED.text          -> resourceHelper.gs(R.string.careportal_cgmsensorstart)
            TherapyEvent.Type.SENSOR_STOPPED.text          -> resourceHelper.gs(R.string.careportal_cgm_sensor_stop)
            TherapyEvent.Type.SENSOR_CHANGE.text           -> resourceHelper.gs(R.string.careportal_cgmsensorinsert)
            TherapyEvent.Type.INSULIN_CHANGE.text          -> resourceHelper.gs(R.string.careportal_insulincartridgechange)
            TherapyEvent.Type.DAD_ALERT.text               -> resourceHelper.gs(R.string.careportal_dad_alert)
            TherapyEvent.Type.TEMPORARY_BASAL_START.text   -> resourceHelper.gs(R.string.careportal_tempbasalstart)
            TherapyEvent.Type.TEMPORARY_BASAL_END.text     -> resourceHelper.gs(R.string.careportal_tempbasalend)
            TherapyEvent.Type.PROFILE_SWITCH.text          -> resourceHelper.gs(R.string.careportal_profileswitch)
            TherapyEvent.Type.TEMPORARY_TARGET.text        -> resourceHelper.gs(R.string.careportal_temporarytarget)
            TherapyEvent.Type.TEMPORARY_TARGET_CANCEL.text -> resourceHelper.gs(R.string.careportal_temporarytargetcancel)
            TherapyEvent.Type.APS_OFFLINE.text             -> resourceHelper.gs(R.string.careportal_openapsoffline)
            TherapyEvent.Type.NS_MBG.text                  -> resourceHelper.gs(R.string.careportal_mbg)
            TherapyEvent.MeterType.FINGER.text             -> resourceHelper.gs(R.string.glucosetype_finger)
            TherapyEvent.MeterType.SENSOR.text             -> resourceHelper.gs(R.string.glucosetype_sensor)
            TherapyEvent.MeterType.MANUAL.text             -> resourceHelper.gs(R.string.manual)

            else                                           -> resourceHelper.gs(R.string.unknown)
        }

    fun translate(action: Action): String = when(action) {
        Action.BOLUS                               -> resourceHelper.gs(R.string.uel_bolus)
        Action.BOLUS_ADVISOR                       -> resourceHelper.gs(R.string.uel_bolus_advisor)
        Action.BOLUS_RECORD                        -> resourceHelper.gs(R.string.uel_bolus_record)
        Action.EXTENDED_BOLUS                      -> resourceHelper.gs(R.string.uel_extended_bolus)
        Action.SUPERBOLUS_TBR                      -> resourceHelper.gs(R.string.uel_superbolus_tbr)
        Action.CARBS                               -> resourceHelper.gs(R.string.uel_carbs)
        Action.EXTENDED_CARBS                      -> resourceHelper.gs(R.string.uel_extended_carbs)
        Action.TEMP_BASAL                          -> resourceHelper.gs(R.string.uel_temp_basal)
        Action.TT                                  -> resourceHelper.gs(R.string.uel_tt)
        Action.NEW_PROFILE                         -> resourceHelper.gs(R.string.uel_new_profile)
        Action.CLONE_PROFILE                       -> resourceHelper.gs(R.string.uel_clone_profile)
        Action.STORE_PROFILE                       -> resourceHelper.gs(R.string.uel_store_profile)
        Action.PROFILE_SWITCH                      -> resourceHelper.gs(R.string.uel_profile_switch)
        Action.PROFILE_SWITCH_CLONED               -> resourceHelper.gs(R.string.uel_profile_switch_cloned)
        Action.CLOSED_LOOP_MODE                    -> resourceHelper.gs(R.string.uel_closed_loop_mode)
        Action.LGS_LOOP_MODE                       -> resourceHelper.gs(R.string.uel_lgs_loop_mode)
        Action.OPEN_LOOP_MODE                      -> resourceHelper.gs(R.string.uel_open_loop_mode)
        Action.LOOP_DISABLED                       -> resourceHelper.gs(R.string.uel_loop_disabled)
        Action.LOOP_ENABLED                        -> resourceHelper.gs(R.string.uel_loop_enabled)
        Action.RECONNECT                           -> resourceHelper.gs(R.string.uel_reconnect)
        Action.DISCONNECT                          -> resourceHelper.gs(R.string.uel_disconnect)
        Action.RESUME                              -> resourceHelper.gs(R.string.uel_resume)
        Action.SUSPEND                             -> resourceHelper.gs(R.string.uel_suspend)
        Action.HW_PUMP_ALLOWED                     -> resourceHelper.gs(R.string.uel_hw_pump_allowed)
        Action.CLEAR_PAIRING_KEYS                  -> resourceHelper.gs(R.string.uel_clear_pairing_keys)
        Action.ACCEPTS_TEMP_BASAL                  -> resourceHelper.gs(R.string.uel_accepts_temp_basal)
        Action.CANCEL_TEMP_BASAL                   -> resourceHelper.gs(R.string.uel_cancel_temp_basal)
        Action.CANCEL_EXTENDED_BOLUS               -> resourceHelper.gs(R.string.uel_cancel_extended_bolus)
        Action.CANCEL_TT                           -> resourceHelper.gs(R.string.uel_cancel_tt)
        Action.CAREPORTAL                          -> resourceHelper.gs(R.string.uel_careportal)
        Action.CALIBRATION                         -> resourceHelper.gs(R.string.uel_calibration)
        Action.PRIME_BOLUS                         -> resourceHelper.gs(R.string.uel_prime_bolus)
        Action.TREATMENT                           -> resourceHelper.gs(R.string.uel_treatment)
        Action.CAREPORTAL_NS_REFRESH               -> resourceHelper.gs(R.string.uel_careportal_ns_refresh)
        Action.PROFILE_SWITCH_NS_REFRESH           -> resourceHelper.gs(R.string.uel_profile_switch_ns_refresh)
        Action.TREATMENTS_NS_REFRESH               -> resourceHelper.gs(R.string.uel_treatments_ns_refresh)
        Action.TT_NS_REFRESH                       -> resourceHelper.gs(R.string.uel_tt_ns_refresh)
        Action.AUTOMATION_REMOVED                  -> resourceHelper.gs(R.string.uel_automation_removed)
        Action.BG_REMOVED                          -> resourceHelper.gs(R.string.uel_bg_removed)
        Action.CAREPORTAL_REMOVED                  -> resourceHelper.gs(R.string.uel_careportal_removed)
        Action.EXTENDED_BOLUS_REMOVED              -> resourceHelper.gs(R.string.uel_extended_bolus_removed)
        Action.FOOD_REMOVED                        -> resourceHelper.gs(R.string.uel_food_removed)
        Action.PROFILE_REMOVED                     -> resourceHelper.gs(R.string.uel_profile_removed)
        Action.PROFILE_SWITCH_REMOVED              -> resourceHelper.gs(R.string.uel_profile_switch_removed)
        Action.RESTART_EVENTS_REMOVED              -> resourceHelper.gs(R.string.uel_restart_events_removed)
        Action.TREATMENT_REMOVED                   -> resourceHelper.gs(R.string.uel_treatment_removed)
        Action.TT_REMOVED                          -> resourceHelper.gs(R.string.uel_tt_removed)
        Action.NS_PAUSED                           -> resourceHelper.gs(R.string.uel_ns_paused)
        Action.NS_RESUME                           -> resourceHelper.gs(R.string.uel_ns_resume)
        Action.NS_QUEUE_CLEARED                    -> resourceHelper.gs(R.string.uel_ns_queue_cleared)
        Action.NS_SETTINGS_COPIED                  -> resourceHelper.gs(R.string.uel_ns_settings_copied)
        Action.ERROR_DIALOG_OK                     -> resourceHelper.gs(R.string.uel_error_dialog_ok)
        Action.ERROR_DIALOG_MUTE                   -> resourceHelper.gs(R.string.uel_error_dialog_mute)
        Action.ERROR_DIALOG_MUTE_5MIN              -> resourceHelper.gs(R.string.uel_error_dialog_mute_5min)
        Action.OBJECTIVE_STARTED                   -> resourceHelper.gs(R.string.uel_objective_started)
        Action.OBJECTIVE_UNSTARTED                 -> resourceHelper.gs(R.string.uel_objective_unstarted)
        Action.OBJECTIVES_SKIPPED                  -> resourceHelper.gs(R.string.uel_objectives_skipped)
        Action.STAT_RESET                          -> resourceHelper.gs(R.string.uel_stat_reset)
        Action.DELETE_LOGS                         -> resourceHelper.gs(R.string.uel_delete_logs)
        Action.DELETE_FUTURE_TREATMENTS            -> resourceHelper.gs(R.string.uel_delete_future_treatments)
        Action.EXPORT_SETTINGS                     -> resourceHelper.gs(R.string.uel_export_settings)
        Action.IMPORT_SETTINGS                     -> resourceHelper.gs(R.string.uel_import_settings)
        Action.RESET_DATABASES                     -> resourceHelper.gs(R.string.uel_reset_databases)
        Action.EXPORT_DATABASES                    -> resourceHelper.gs(R.string.uel_export_databases)
        Action.IMPORT_DATABASES                    -> resourceHelper.gs(R.string.uel_import_databases)
        Action.OTP_EXPORT                          -> resourceHelper.gs(R.string.uel_otp_export)
        Action.OTP_RESET                           -> resourceHelper.gs(R.string.uel_otp_reset)
        Action.SMS_BASAL                           -> resourceHelper.gs(R.string.uel_sms_basal)
        Action.SMS_BOLUS                           -> resourceHelper.gs(R.string.uel_sms_bolus)
        Action.SMS_CAL                             -> resourceHelper.gs(R.string.uel_sms_cal)
        Action.SMS_CARBS                           -> resourceHelper.gs(R.string.uel_sms_carbs)
        Action.SMS_EXTENDED_BOLUS                  -> resourceHelper.gs(R.string.uel_sms_extended_bolus)
        Action.SMS_LOOP_DISABLED                   -> resourceHelper.gs(R.string.uel_sms_loop_disabled)
        Action.SMS_LOOP_ENABLED                    -> resourceHelper.gs(R.string.uel_sms_loop_enabled)
        Action.SMS_LOOP_RESUME                     -> resourceHelper.gs(R.string.uel_sms_loop_resume)
        Action.SMS_LOOP_SUSPEND                    -> resourceHelper.gs(R.string.uel_sms_loop_suspend)
        Action.SMS_PROFILE                         -> resourceHelper.gs(R.string.uel_sms_profile)
        Action.SMS_PUMP_CONNECT                    -> resourceHelper.gs(R.string.uel_sms_pump_connect)
        Action.SMS_PUMP_DISCONNECT                 -> resourceHelper.gs(R.string.uel_sms_pump_disconnect)
        Action.SMS_SMS                             -> resourceHelper.gs(R.string.uel_sms_sms)
        Action.SMS_TT                              -> resourceHelper.gs(R.string.uel_sms_tt)
        Action.TT_DELETED_FROM_NS                  -> resourceHelper.gs(R.string.uel_tt_deleted_from_ns)
        Action.TT_FROM_NS                          -> resourceHelper.gs(R.string.uel_tt_from_ns)
        Action.TT_CANCELED_FROM_NS                 -> resourceHelper.gs(R.string.uel_tt_canceleted_from_ns)
        Action.CAREPORTAL_DELETED_FROM_NS          -> resourceHelper.gs(R.string.uel_careportal_deleted_from_ns)
        Action.CAREPORTAL_FROM_NS                  -> resourceHelper.gs(R.string.uel_careportal_from_ns)
        Action.EXPORT_CSV                          -> resourceHelper.gs(R.string.uel_export_csv)
        Action.FOOD_FROM_NS                        -> resourceHelper.gs(R.string.unknown) // TODO?
        Action.UNKNOWN                             -> resourceHelper.gs(R.string.unknown)
    }

    fun translate(units: Units): String = when(units) {
        Units.Mg_Dl                                -> resourceHelper.gs(R.string.mgdl)
        Units.Mmol_L                               -> resourceHelper.gs(R.string.mmol)
        Units.U                                    -> resourceHelper.gs(R.string.insulin_unit_shortname)
        Units.U_H                                  -> resourceHelper.gs(R.string.profile_ins_units_per_hour)
        Units.G                                    -> resourceHelper.gs(R.string.shortgram)
        Units.M                                    -> resourceHelper.gs(R.string.shortminute)
        Units.H                                    -> resourceHelper.gs(R.string.shorthour)
        Units.Percent                              -> resourceHelper.gs(R.string.shortpercent)
        Units.None                                 -> ""

        else                                           -> resourceHelper.gs(R.string.unknown)
    }

    fun translate(meterType: TherapyEvent.MeterType): String = when(meterType) {
        TherapyEvent.MeterType.FINGER                  -> resourceHelper.gs(R.string.glucosetype_finger)
        TherapyEvent.MeterType.SENSOR                  -> resourceHelper.gs(R.string.glucosetype_sensor)
        TherapyEvent.MeterType.MANUAL                  -> resourceHelper.gs(R.string.manual)

        else                                           -> resourceHelper.gs(R.string.unknown)
    }

    fun translate(type: TherapyEvent.Type): String = when(type) {
        TherapyEvent.Type.FINGER_STICK_BG_VALUE   -> resourceHelper.gs(R.string.careportal_bgcheck)
        TherapyEvent.Type.SNACK_BOLUS             -> resourceHelper.gs(R.string.careportal_snackbolus)
        TherapyEvent.Type.MEAL_BOLUS              -> resourceHelper.gs(R.string.careportal_mealbolus)
        TherapyEvent.Type.CORRECTION_BOLUS        -> resourceHelper.gs(R.string.careportal_correctionbolus)
        TherapyEvent.Type.CARBS_CORRECTION        -> resourceHelper.gs(R.string.careportal_carbscorrection)
        TherapyEvent.Type.BOLUS_WIZARD            -> resourceHelper.gs(R.string.boluswizard)
        TherapyEvent.Type.COMBO_BOLUS             -> resourceHelper.gs(R.string.careportal_combobolus)
        TherapyEvent.Type.ANNOUNCEMENT            -> resourceHelper.gs(R.string.careportal_announcement)
        TherapyEvent.Type.NOTE                    -> resourceHelper.gs(R.string.careportal_note)
        TherapyEvent.Type.QUESTION                -> resourceHelper.gs(R.string.careportal_question)
        TherapyEvent.Type.EXERCISE                -> resourceHelper.gs(R.string.careportal_exercise)
        TherapyEvent.Type.CANNULA_CHANGE          -> resourceHelper.gs(R.string.careportal_pumpsitechange)
        TherapyEvent.Type.PUMP_BATTERY_CHANGE     -> resourceHelper.gs(R.string.careportal_pumpbatterychange)
        TherapyEvent.Type.SENSOR_STARTED          -> resourceHelper.gs(R.string.careportal_cgmsensorstart)
        TherapyEvent.Type.SENSOR_STOPPED          -> resourceHelper.gs(R.string.careportal_cgm_sensor_stop)
        TherapyEvent.Type.SENSOR_CHANGE           -> resourceHelper.gs(R.string.careportal_cgmsensorinsert)
        TherapyEvent.Type.INSULIN_CHANGE          -> resourceHelper.gs(R.string.careportal_insulincartridgechange)
        TherapyEvent.Type.DAD_ALERT               -> resourceHelper.gs(R.string.careportal_dad_alert)
        TherapyEvent.Type.TEMPORARY_BASAL_START   -> resourceHelper.gs(R.string.careportal_tempbasalstart)
        TherapyEvent.Type.TEMPORARY_BASAL_END     -> resourceHelper.gs(R.string.careportal_tempbasalend)
        TherapyEvent.Type.PROFILE_SWITCH          -> resourceHelper.gs(R.string.careportal_profileswitch)
        TherapyEvent.Type.TEMPORARY_TARGET        -> resourceHelper.gs(R.string.careportal_temporarytarget)
        TherapyEvent.Type.TEMPORARY_TARGET_CANCEL -> resourceHelper.gs(R.string.careportal_temporarytargetcancel)
        TherapyEvent.Type.APS_OFFLINE             -> resourceHelper.gs(R.string.careportal_openapsoffline)
        TherapyEvent.Type.NS_MBG                  -> resourceHelper.gs(R.string.careportal_mbg)

        else                                           -> resourceHelper.gs(R.string.unknown)
    }

    fun translate(reason: TemporaryTarget.Reason): String = when(reason) {
        TemporaryTarget.Reason.CUSTOM             -> resourceHelper.gs(R.string.custom)
        TemporaryTarget.Reason.HYPOGLYCEMIA       -> resourceHelper.gs(R.string.hypo)
        TemporaryTarget.Reason.EATING_SOON        -> resourceHelper.gs(R.string.eatingsoon)
        TemporaryTarget.Reason.ACTIVITY           -> resourceHelper.gs(R.string.activity)
        TemporaryTarget.Reason.AUTOMATION         -> resourceHelper.gs(R.string.automation)
        TemporaryTarget.Reason.WEAR               -> resourceHelper.gs(R.string.wear)

        else                                           -> resourceHelper.gs(R.string.unknown)
    }
    
}