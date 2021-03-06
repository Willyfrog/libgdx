/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btWheelInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btWheelInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btWheelInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btWheelInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_raycastInfo(SWIGTYPE_p_btWheelInfo__RaycastInfo value) {
    gdxBulletJNI.btWheelInfo_m_raycastInfo_set(swigCPtr, this, SWIGTYPE_p_btWheelInfo__RaycastInfo.getCPtr(value));
  }

  public SWIGTYPE_p_btWheelInfo__RaycastInfo getM_raycastInfo() {
    long cPtr = gdxBulletJNI.btWheelInfo_m_raycastInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btWheelInfo__RaycastInfo(cPtr, false);
  }

  public void setM_worldTransform(btTransform value) {
    gdxBulletJNI.btWheelInfo_m_worldTransform_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getM_worldTransform() {
    long cPtr = gdxBulletJNI.btWheelInfo_m_worldTransform_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setM_chassisConnectionPointCS(btVector3 value) {
    gdxBulletJNI.btWheelInfo_m_chassisConnectionPointCS_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_chassisConnectionPointCS() {
    long cPtr = gdxBulletJNI.btWheelInfo_m_chassisConnectionPointCS_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_wheelDirectionCS(btVector3 value) {
    gdxBulletJNI.btWheelInfo_m_wheelDirectionCS_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_wheelDirectionCS() {
    long cPtr = gdxBulletJNI.btWheelInfo_m_wheelDirectionCS_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_wheelAxleCS(btVector3 value) {
    gdxBulletJNI.btWheelInfo_m_wheelAxleCS_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_wheelAxleCS() {
    long cPtr = gdxBulletJNI.btWheelInfo_m_wheelAxleCS_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_suspensionRestLength1(float value) {
    gdxBulletJNI.btWheelInfo_m_suspensionRestLength1_set(swigCPtr, this, value);
  }

  public float getM_suspensionRestLength1() {
    return gdxBulletJNI.btWheelInfo_m_suspensionRestLength1_get(swigCPtr, this);
  }

  public void setM_maxSuspensionTravelCm(float value) {
    gdxBulletJNI.btWheelInfo_m_maxSuspensionTravelCm_set(swigCPtr, this, value);
  }

  public float getM_maxSuspensionTravelCm() {
    return gdxBulletJNI.btWheelInfo_m_maxSuspensionTravelCm_get(swigCPtr, this);
  }

  public float getSuspensionRestLength() {
    return gdxBulletJNI.btWheelInfo_getSuspensionRestLength(swigCPtr, this);
  }

  public void setM_wheelsRadius(float value) {
    gdxBulletJNI.btWheelInfo_m_wheelsRadius_set(swigCPtr, this, value);
  }

  public float getM_wheelsRadius() {
    return gdxBulletJNI.btWheelInfo_m_wheelsRadius_get(swigCPtr, this);
  }

  public void setM_suspensionStiffness(float value) {
    gdxBulletJNI.btWheelInfo_m_suspensionStiffness_set(swigCPtr, this, value);
  }

  public float getM_suspensionStiffness() {
    return gdxBulletJNI.btWheelInfo_m_suspensionStiffness_get(swigCPtr, this);
  }

  public void setM_wheelsDampingCompression(float value) {
    gdxBulletJNI.btWheelInfo_m_wheelsDampingCompression_set(swigCPtr, this, value);
  }

  public float getM_wheelsDampingCompression() {
    return gdxBulletJNI.btWheelInfo_m_wheelsDampingCompression_get(swigCPtr, this);
  }

  public void setM_wheelsDampingRelaxation(float value) {
    gdxBulletJNI.btWheelInfo_m_wheelsDampingRelaxation_set(swigCPtr, this, value);
  }

  public float getM_wheelsDampingRelaxation() {
    return gdxBulletJNI.btWheelInfo_m_wheelsDampingRelaxation_get(swigCPtr, this);
  }

  public void setM_frictionSlip(float value) {
    gdxBulletJNI.btWheelInfo_m_frictionSlip_set(swigCPtr, this, value);
  }

  public float getM_frictionSlip() {
    return gdxBulletJNI.btWheelInfo_m_frictionSlip_get(swigCPtr, this);
  }

  public void setM_steering(float value) {
    gdxBulletJNI.btWheelInfo_m_steering_set(swigCPtr, this, value);
  }

  public float getM_steering() {
    return gdxBulletJNI.btWheelInfo_m_steering_get(swigCPtr, this);
  }

  public void setM_rotation(float value) {
    gdxBulletJNI.btWheelInfo_m_rotation_set(swigCPtr, this, value);
  }

  public float getM_rotation() {
    return gdxBulletJNI.btWheelInfo_m_rotation_get(swigCPtr, this);
  }

  public void setM_deltaRotation(float value) {
    gdxBulletJNI.btWheelInfo_m_deltaRotation_set(swigCPtr, this, value);
  }

  public float getM_deltaRotation() {
    return gdxBulletJNI.btWheelInfo_m_deltaRotation_get(swigCPtr, this);
  }

  public void setM_rollInfluence(float value) {
    gdxBulletJNI.btWheelInfo_m_rollInfluence_set(swigCPtr, this, value);
  }

  public float getM_rollInfluence() {
    return gdxBulletJNI.btWheelInfo_m_rollInfluence_get(swigCPtr, this);
  }

  public void setM_maxSuspensionForce(float value) {
    gdxBulletJNI.btWheelInfo_m_maxSuspensionForce_set(swigCPtr, this, value);
  }

  public float getM_maxSuspensionForce() {
    return gdxBulletJNI.btWheelInfo_m_maxSuspensionForce_get(swigCPtr, this);
  }

  public void setM_engineForce(float value) {
    gdxBulletJNI.btWheelInfo_m_engineForce_set(swigCPtr, this, value);
  }

  public float getM_engineForce() {
    return gdxBulletJNI.btWheelInfo_m_engineForce_get(swigCPtr, this);
  }

  public void setM_brake(float value) {
    gdxBulletJNI.btWheelInfo_m_brake_set(swigCPtr, this, value);
  }

  public float getM_brake() {
    return gdxBulletJNI.btWheelInfo_m_brake_get(swigCPtr, this);
  }

  public void setM_bIsFrontWheel(boolean value) {
    gdxBulletJNI.btWheelInfo_m_bIsFrontWheel_set(swigCPtr, this, value);
  }

  public boolean getM_bIsFrontWheel() {
    return gdxBulletJNI.btWheelInfo_m_bIsFrontWheel_get(swigCPtr, this);
  }

  public void setM_clientInfo(SWIGTYPE_p_void value) {
    gdxBulletJNI.btWheelInfo_m_clientInfo_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getM_clientInfo() {
    long cPtr = gdxBulletJNI.btWheelInfo_m_clientInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public btWheelInfo(btWheelInfoConstructionInfo ci) {
    this(gdxBulletJNI.new_btWheelInfo__SWIG_0(btWheelInfoConstructionInfo.getCPtr(ci), ci), true);
  }

  public btWheelInfo() {
    this(gdxBulletJNI.new_btWheelInfo__SWIG_1(), true);
  }

  public void updateWheel(btRigidBody chassis, SWIGTYPE_p_btWheelInfo__RaycastInfo raycastInfo) {
    gdxBulletJNI.btWheelInfo_updateWheel(swigCPtr, this, btRigidBody.getCPtr(chassis), chassis, SWIGTYPE_p_btWheelInfo__RaycastInfo.getCPtr(raycastInfo));
  }

  public void setM_clippedInvContactDotSuspension(float value) {
    gdxBulletJNI.btWheelInfo_m_clippedInvContactDotSuspension_set(swigCPtr, this, value);
  }

  public float getM_clippedInvContactDotSuspension() {
    return gdxBulletJNI.btWheelInfo_m_clippedInvContactDotSuspension_get(swigCPtr, this);
  }

  public void setM_suspensionRelativeVelocity(float value) {
    gdxBulletJNI.btWheelInfo_m_suspensionRelativeVelocity_set(swigCPtr, this, value);
  }

  public float getM_suspensionRelativeVelocity() {
    return gdxBulletJNI.btWheelInfo_m_suspensionRelativeVelocity_get(swigCPtr, this);
  }

  public void setM_wheelsSuspensionForce(float value) {
    gdxBulletJNI.btWheelInfo_m_wheelsSuspensionForce_set(swigCPtr, this, value);
  }

  public float getM_wheelsSuspensionForce() {
    return gdxBulletJNI.btWheelInfo_m_wheelsSuspensionForce_get(swigCPtr, this);
  }

  public void setM_skidInfo(float value) {
    gdxBulletJNI.btWheelInfo_m_skidInfo_set(swigCPtr, this, value);
  }

  public float getM_skidInfo() {
    return gdxBulletJNI.btWheelInfo_m_skidInfo_get(swigCPtr, this);
  }

}
