<template>
  <div class="about container-fluid">
    <h1> Register </h1>
  
    <div>
      <form v-on:submit.prevent="submitForm" id="registerForm" class="row g-3">
        <div class="col-md-6">
          <div class="form-outline input-border">
            <input type="text" class="form-control" id="validationCustom01" v-model="username" required />
            <label for="validationCustom01" class="form-label">Username</label>
            <div class="invalid-feedback">Please provide a valid username.</div>
            <div class="valid-feedback">Looks good!</div>
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-outline input-border">
            <input type="email" class="form-control" id="validationCustom02" v-model="email" required />
            <label for="validationCustom02" class="form-label">Email</label>
            <div class="invalid-feedback">Please provide a valid email.</div>
            <div class="valid-feedback">Looks good!</div>
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-outline input-border">
            <input type="number" min="0" class="form-control" id="validationCustom03" v-model="balance" required />
            <label for="validationCustom03" class="form-label">Balance</label>
            <div class="invalid-feedback">Please provide a positive number.</div>
            <div class="valid-feedback">Looks good!</div>
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-outline input-border">
            <input type="password" class="form-control" id="validationCustom05" v-model="password" required />
            <label for="validationCustom05" class="form-label">Password</label>
            <div class="invalid-feedback">Please provide a valid password.</div>
            <div class="valid-feedback">Looks good!</div>
          </div>
        </div>
        <div class="col-12">
          <button class="btn btn-primary" type="submit" value="Register">Register</button>
        </div>
      </form>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'Register',
  data() {
    return {
      form: {
        username : "",
        email : "",
        balance : "",
        password : ""
      }
    }
  },
  methods:{
    submitForm(){
      axios.post('http://localhost:8080/register', this.form)
           .then(() => {
              //Perform Success Action
           })
           .catch(() => {
              // error.response.status Check status code
           }).finally(() => {
              //Perform action in always
           });
    }
  }
}
</script>
