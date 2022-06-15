<template>
  <div class="about container-fluid">
    <h1> Login </h1>
  
    <div>
      <form v-on:submit.prevent="submitLoginForm" id="loginForm" class="row g-3">
        <div class="col-md-12">
          <div class="form-outline input-border">
            <input type="text" class="form-control" v-model="username" required />
            <label class="form-label">Username</label>
          </div>
        </div>
        <div class="col-md-12">
          <div class="form-outline input-border">
            <input type="password" class="form-control" v-model="password" required />
            <label class="form-label">Password</label>
          </div>
        </div>
        <div class="col-12">
          <button class="btn btn-primary" type="submit" value="Login">Login</button>
        </div>
      </form>
    </div>
  </div>
</template>

<script>
//import axios from 'axios'

export default {
  name: 'Login',
  data() {
    return {
      
    }
  },
  methods: {

  },
}
</script>
