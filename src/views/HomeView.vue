<template>
  <div>
    <el-button type="primary">按钮</el-button>
    <div>
      <h1>用户列表</h1>
      <ul>
        <li v-for="academicStaff in users" :key="academicStaff.academicStaffID">{{ academicStaff.age }}--{{academicStaff.name}}</li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name:'HomeView',
  data () {
    return {
      users: []
    }
  },
  mounted () {
    this.$axios.get('/academicStaff/getAll')
        .then(response => {
          this.users = response.data
        })
        .catch(error => {
          console.log(error)
        })
  }
}
</script>
