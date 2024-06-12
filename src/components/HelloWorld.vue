<template>
  <div class="hello">
    {{ msg }}
    <div>
      <h1>用户列表</h1>
      <ul>
        <li v-for="student in users" :key="student.StudentID">{{ student.Password }}</li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  data () {

    return {
      msg:'Hello World',
      users: []
    }
  },
  mounted () {
    this.$axios.get('/getStudents')
        .then(response => {
          this.users = response.data
        })
        .catch(error => {
          console.log(error)
        })
  }
}
</script>

